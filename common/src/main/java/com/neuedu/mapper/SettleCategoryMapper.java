package com.neuedu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SettleCategoryMapper {

	List<Map<String,Object>> getSettleCategoryList();
}
