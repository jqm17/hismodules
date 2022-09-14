package com.neuedu.controller.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.service.registration.RegisterService;

@RestController
@CrossOrigin
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/getCaseNumber")
	public String getCaseNumber() {
		Integer result = Integer.parseInt(registerService.getMaxCaseNumber());
		Integer num = result+1;
		return num.toString();
	}
	@GetMapping("/getUsedNumberByEmployeeIdAndNoon")
	public Integer getUsedNumberByEmployeeIdAndNoon(Integer empId, String noon) {
		return registerService.getUsedNumberByEmployeeIdAndNoon(empId, noon);
	}
}
