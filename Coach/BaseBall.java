package com.ncu.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bcoach")
public class BaseBall implements ICoach{
	@Autowired
	@Qualifier("fortune")
	private IFortune ifortune;
	
	public String getDailyWorkout()
	{
		return "Practice 5 hrs daily";
	}

	@Override
	public String getDailyFortune() {
		return ifortune.getFortune();
	}

}
