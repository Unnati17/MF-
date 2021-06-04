package ProducerConsumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import firstIOc.Coach;

public class Consumer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// retrieve bean from spring container
	IProducer thePro = (IProducer) context.getBean("fPro");
		
		// call methods on the bean
	thePro.speed();
	
	}

}
