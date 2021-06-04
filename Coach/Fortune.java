package com.ncu.Coach;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune{

	public String getFortune()
	{
		return "It's your lucky day";
	}
	
}
