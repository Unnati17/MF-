package com.ncu.Coach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("annospring.xml");
    	TennisCoach coach=(TennisCoach)ac.getBean("tcoach",TennisCoach.class);
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFortune());
    	
    	CricketCoach cc=(CricketCoach) ac.getBean("ccoach");
    	System.out.println(cc.getDailyWorkout());
    	System.out.println(cc.getDailyFortune());
    	System.out.println(cc.getName());
    	
    	HockeyCoach hc=(HockeyCoach) ac.getBean("hcoach");
    	System.out.println(hc.getDailyWorkout());
    	System.out.println(hc.getDailyFortune());
    	System.out.println(hc.getName());
    	System.out.println(hc.getNo());
		
	}

}
