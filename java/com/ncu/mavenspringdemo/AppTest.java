package com.ncu.mavenspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	
	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	A getit = (A)context.getBean("inject");	

	}
}