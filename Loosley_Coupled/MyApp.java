package Loosley_Coupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) 
	{
			ApplicationContext context = new ClassPathXmlApplicationContext("LCspring.xml");
						
		
			ICoach theCoach = (ICoach)context.getBean("myCoach");	
			
			System.out.println(theCoach.getDailyWorkout());

	}
}