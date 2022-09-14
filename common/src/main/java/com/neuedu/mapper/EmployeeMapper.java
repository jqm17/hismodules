package com.neuedu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

	/**
	 * 根据科室id和好别id查询医生
	 * @param deptId
	 * @param levelId
	 * @return
	 */
	List<Map<String,Object>> getEmpByDeptIdAndLevelId(Integer deptId,Integer levelId);
}
