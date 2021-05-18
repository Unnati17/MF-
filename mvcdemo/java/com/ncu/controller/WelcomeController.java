package com.ncu.controller;


import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import javax.servlet.http.HttpServletRequest;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.models.CustomerDets;
import com.ncu.models.Users;

@Controller
public class WelcomeController {
	
	

//	@RequestMapping(path="/home",method=RequestMethod.GET)
//	public String doLogin(@RequestParam(required=false,name="studentName") String sid, Model model) 
//	{
//		model.addAttribute("msg",sid);
//		return "Home-page";
//	}
	
//	@RequestMapping("/home")
//	public String login(Model model) 
//	{
//	model.addAttribute("userModel",new Users());
//	return "welcome";
//	}
//	
//	@RequestMapping(path="/login",method = RequestMethod.POST)
//	public String login(@ModelAttribute("userModel") Users user,Model model) 
//	{
//	model.addAttribute("UserID",user.getUserid());
//	return "dashboard";
//	}
	
	
//	@RequestMapping("/login")
//	public String loginmsg(Model model) 
//	{
//		return "login";
//	}
//	
	
	
	@RequestMapping("/home")
	public String doLogin(HttpServletRequest request, Model model)
	{
		String studentName=request.getParameter("studentName");
		model.addAttribute("msg",studentName);
		return "Home-page";
	}
	
	@RequestMapping("/login")
	public String loginmsg(Model model) 
	{
		return "login";
	}
	
	
	
	
//	@RequestMapping("/home")
//	public String Home()
//	{
//		return "Home-page";
//  }

	
//	public String welcomemsg(Model model) {
//		model.addAttribute("msg", "Homepage");
//		return "welcome";
//	}
////	@RequestMapping("/login")
////	public String loginmsg(Model model) {
////		model.addAttribute("msg", "kalra login");
////		return "login";
////	}
//	@RequestMapping("/home")
//	public String doLogin(Htt pServletRequest request, Model model) {
//		String userId=request.getParameter("studentName");
//		model.addAttribute("msg", "your login"+studentName);
//		return "Home-page";
//	}
	
//	@RequestMapping(path="/login",method = RequestMethod.POST)
//	public String login(@ModelAttribute("customerModel") CustomerDets cus,Model model) 
//	{
//		model.addAttribute("name",cus.getName());
//		model.addAttribute("product",cus.getPrd());
//		return "dashboard";
//
//	}
}