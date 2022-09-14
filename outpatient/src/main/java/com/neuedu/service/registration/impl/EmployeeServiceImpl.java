package com.neuedu.service.registration.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.EmployeeMapper;
import com.neuedu.service.registration.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public List<Map<String, Object>> getEmployeeList(Integer deptId, Integer levelId) {
		// TODO Auto-generated method stub
		//根据部门id和好别id查询出来的所有医生
		List<Map<String, Object>> list = employeeMapper.getEmpByDeptIdAndLevelId(deptId, levelId);
		//根据日期及午别过滤，获得坐班医生
		List<Map<String, Object>> newList = new ArrayList<>();
		//排班规则00 00 00 00 00 00 00根据星期几，午别进行判断，对应位置数字为1，为1就当班，添加到newList中
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int noon = cal.get(Calendar.AM_PM);
		int index = (week-1)*2+noon;
		for(Map<String,Object> map:list) {
			String weekRule = map.get("week_rule").toString();
			char c = weekRule.charAt(index);
			if(c == '1') {
				newList.add(map);
			}
		}
		return newList;
	}

}
