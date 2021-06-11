package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.model.UserLogin;

@Controller
public class LoginController {
	
	@GetMapping("/home")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String userRegistration(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "register";
	}
	
	@GetMapping("/login")
	public String userLogin(Model model) {
		model.addAttribute("UserModel", new UserLogin());
		return "login";
	}
	
	@RequestMapping(path = "/view",method = RequestMethod.POST)
	public String displayWelcome(@ModelAttribute ("UserModel") UserLogin user, Model model ) {
		
		model.addAttribute("Email", user.getEmail());
		model.addAttribute("Password", user.getPassword());
		;
		model.addAttribute("Name", user.getUsername());
	
		return "view";
	}
	
	@GetMapping("/accessdenie")
	public String showMyDeniedPage() {
		
		return "accessdenied";
		
	}
}