package Scope_ques;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
	
		A obj1= (A)context.getBean("inject");	
		A obj2 = (A)context.getBean("inject");	

	}

}
