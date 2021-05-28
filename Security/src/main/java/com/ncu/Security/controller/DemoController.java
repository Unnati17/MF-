package com.ncu.Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@GetMapping("/leaders")
	public String showLeaderpage() {
		return "leader-page";
	}
	
	@GetMapping("/systems")
	public String showAdminpage() {
		return "admin";
	}
}
