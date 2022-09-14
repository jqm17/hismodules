package com.neuedu.controller.registration;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.service.registration.DepartmentService;


@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/getDeptList")
	public List<Map<String,Object>> getDeptList(){
		return departmentService.getDeptList();
	}
}
