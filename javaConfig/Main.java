package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Coach coach=(Coach)context.getBean("hockeyCoach",HockeyCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortmethod());		
			

	}

}
