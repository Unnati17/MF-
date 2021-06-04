package com.ncu.Coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ccoach")
public class CricketCoach implements ICoach{

@Value(value="Virendra Dahiya")
private String name;

	@Override
	public String getDailyWorkout() {
		
		return "Practice for 5hrs daily";
	}

	@Override
	public String getDailyFortune() {
		return "You'll perform great in match";
	}

	public String getName() {
		return name;
	}

}
