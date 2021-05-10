package com.divergentsl.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

	@GetMapping("/doctorlogin")
	public String doctorLogin() {
		return "DoctorLogin";
	}
	
}
