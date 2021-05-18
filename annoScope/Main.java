package annoScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
public static void main(String[] args) 
{
		ApplicationContext context = new ClassPathXmlApplicationContext("scopespring.xml");
		A obj1= (A)context.getBean("a");	
		A obj2 = (A)context.getBean("a");	

	}

}
