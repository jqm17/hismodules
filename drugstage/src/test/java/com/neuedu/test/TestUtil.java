package com.neuedu.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.neuedu.utils.DateUtil;

public class TestUtil {

	@Test
	public  void testUtil(){
		Date date = DateUtil.string2Date("2022-10-01");
		System.out.println("时间"+date);
	}
}
