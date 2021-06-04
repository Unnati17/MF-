package com.ncu.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hcoach")
public class HockeyCoach implements ICoach{
	
	@Value("${player_name}")
	private String name;
	@Value("${jersey_no}")
	private String jersey_no;
	
	private IFortune fortune; 
	@Autowired
	public HockeyCoach(@Qualifier("happyFortuneService")IFortune fortune)
	{
		this.fortune=fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for 5hrs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public String getNo() {
		// TODO Auto-generated method stub
		return jersey_no;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
