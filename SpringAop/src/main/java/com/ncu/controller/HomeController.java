package com.ncu.controller;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	private final Logger log=Logger.getLogger(getClass().getName());
	
	@RequestMapping("/aop")
	public String home()
	{
		log.info("info message");
		return "index";
	}
	
}
