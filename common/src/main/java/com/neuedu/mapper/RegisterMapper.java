package com.neuedu.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {

	String getMaxCaseNumber();

}
