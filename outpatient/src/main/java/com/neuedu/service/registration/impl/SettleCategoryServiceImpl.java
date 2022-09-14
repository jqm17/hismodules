package com.neuedu.service.registration.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.SettleCategoryMapper;
import com.neuedu.service.registration.SettleCategoryService;
@Service
@Transactional
public class SettleCategoryServiceImpl implements SettleCategoryService {

	@Autowired
	private SettleCategoryMapper settleCategoryMapper;
	@Override
	public List<Map<String, Object>> getSettleCategoryList() {
		// TODO Auto-generated method stub
		return settleCategoryMapper.getSettleCategoryList();
	}

}
