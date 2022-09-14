package com.neuedu.service.registration.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.RegistLevelMapper;
import com.neuedu.service.registration.RegistLevelService;
@Service
@Transactional
public class RegistLevelServiceImpl implements RegistLevelService {

	@Autowired
	private RegistLevelMapper registLevelMapper;
	@Override
	public List<Map<String, Object>> getRegistLevelMapper() {
		// TODO Auto-generated method stub
		return registLevelMapper.getRegistLevelMapper();
	}

}
