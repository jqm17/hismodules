package com.neuedu.service.registration.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.RegisterMapper;
import com.neuedu.service.registration.RegisterService;
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterMapper registerMapper;

	@Override
	public String getMaxCaseNumber() {
		// TODO Auto-generated method stub
		return registerMapper.getMaxCaseNumber();
	}

	@Override
	public Integer getUsedNumberByEmployeeIdAndNoon(Integer empId, String noon) {
		// TODO Auto-generated method stub
		return registerMapper.getUsedNumberByEmployeeIdAndNoon(empId, noon);
	}
	
	
}
