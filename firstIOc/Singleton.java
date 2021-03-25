package firstIOc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Singleton {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");
		
		
		Coach theCoach = (Coach)context.getBean("myTCoach");	
		Coach coach2 = (Coach)context.getBean("myTCoach");	
		theCoach.setName("John");
		coach2.setName("Jeff");
		
		System.out.println(theCoach.getName());
		System.out.println(coach2.getName());

	}

}
