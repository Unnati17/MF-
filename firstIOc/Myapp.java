package firstIOc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {
	
	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
			Coach theCoach = (Coach)context.getBean("myCoach");	
			
			System.out.println(theCoach.toString());
				
	}
}
