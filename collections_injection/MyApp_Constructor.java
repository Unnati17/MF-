package collections_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp_Constructor {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring_Cons.xml");
		Customer cust=(Customer)context.getBean("new");
		System.out.println(cust.toString());

	}

}