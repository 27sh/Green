package com.example.securityEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/")
	public String welcome() {
		System.out.println("admin welcome.........");
		
		
		
		return "admin/welcome";
	}
}
