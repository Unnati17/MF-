package annoBeanCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_implementation {
	
	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("blcspring.xml");
	Coach coach=(Coach)context.getBean("blf");
	System.out.println(coach);
	
	}
}
