package com.ncu.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tcoach")
public class TennisCoach implements ICoach{
	
	private IFortune fort;
	
	public IFortune fortunegetter() {
		return fort;
	}
	
	@Autowired
	@Qualifier("fortune")
	public void fortunesetter(IFortune fort) {
		this.fort = fort;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Practice 4hrs daily";
	}

	@Override
	public String getDailyFortune() {
		
		return fort.getFortune();
	}
	
	
	
	

}
