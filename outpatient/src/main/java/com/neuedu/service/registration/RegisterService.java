package com.neuedu.service.registration;

public interface RegisterService {

	String getMaxCaseNumber();
	
	Integer getUsedNumberByEmployeeIdAndNoon(Integer empId,String noon);
}
