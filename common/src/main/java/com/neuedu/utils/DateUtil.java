package com.neuedu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date string2Date(String str) {
		Date date = null;
		if(str == null || str.length() == 0) {
			return null;
		}else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(str);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return date;
		}
	}
}
