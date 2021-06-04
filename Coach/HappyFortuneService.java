package com.ncu.Coach;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortune{

	@Override
	public String getFortune() {
		return "You'll be happy this whole week";
	}
	
	
	
	

}
