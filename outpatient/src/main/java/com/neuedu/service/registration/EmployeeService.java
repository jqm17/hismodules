package com.neuedu.service.registration;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

	/**
	 * 根据科室id和好别id查询医生
	 * @param deptId
	 * @param levelId
	 * @return
	 */
	List<Map<String,Object>> getEmployeeList(Integer deptId,Integer levelId);
}
