package com.ncu.typeques;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 private static ApplicationContext context;

	public static void main( String[] args )
	    {
	        context = new ClassPathXmlApplicationContext("spring.xml");
	        Employee em=(Employee)context.getBean("employ");
	        System.out.println(em.toString());
	    
	    }

}
