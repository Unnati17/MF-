package com.ncu.CustomValidations.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.CustomValidations.model.CustomerInfo;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new CustomerInfo());
		
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") CustomerInfo theCustomer,
			BindingResult theBindingResult,Model model) {
		model.addAttribute("fistname",theCustomer.getFirstName());
		model.addAttribute("lastname",theCustomer.getLastName());
		model.addAttribute("freepasses",theCustomer.getFreePasses());
		model.addAttribute("postCode",theCustomer.getPostalCode());
		model.addAttribute("Course",theCustomer.getCourseCode());
		
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		
		
		if (theBindingResult.hasErrors()) {
			return "form";
		}
		else {
			return "confirmation";
		}
	}
}