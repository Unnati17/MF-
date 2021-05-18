package com.ncu.MvcCustomer.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.MvcCustomer.models.CustomerDets;
import com.ncu.MvcCustomer.models.User;

@Controller
@SessionAttributes("customerModel")
public class CustomerController 
{
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) 
	{
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/login")
	public String doregister(Model model) 
	{
		model.addAttribute("userModel",new User());
		return "dashboard";
	}
	
	@RequestMapping(path="/logined")
	public String login(@Valid @ModelAttribute("userModel") User user,BindingResult theBindingResult) 
	{
	
		if(theBindingResult.hasErrors())
		{
			return "dashboard";
		}
	
		else
		{
			System.out.println(user.getUsername());		
			return "interface";
		}	
	
	}
	
	
	@RequestMapping("/review")
	public String doreview(Model model) 
	{
		model.addAttribute("customerModel",new CustomerDets());
		List<String> productList = Arrays.asList("One plus 9","Iphone 12 pro max","Noise colorfit pro 3","JBL Tune earbuds"); 
		model.addAttribute("productList",productList);
	
		return "form";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String formProcessing(@Valid @ModelAttribute("customerModel") CustomerDets custom,BindingResult theBindingResult,Model model)
	{
			System.out.println("First name: |"+custom.getFirstname()+"|");
		
		if(theBindingResult.hasErrors())
		{
			return "form";
		}
		
		else
		{
			model.addAttribute("firstname",custom.getFirstname());
			model.addAttribute("email",custom.getEmail());
			model.addAttribute("review",custom.getReview());
			System.out.println(custom);
			
			return "succesful";
		}	
	}
	
	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("customerModel") CustomerDets custom,Model model) {

		model.addAttribute("firstname",custom.getFirstname());
		model.addAttribute("email",custom.getEmail());
		model.addAttribute("phn",custom.getPhn());
	      
	      return "sinfo";
	   }
	
}
