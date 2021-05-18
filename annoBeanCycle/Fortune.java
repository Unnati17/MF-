package annoBeanCycle;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements IFortune{
	
	public Fortune()
	{
		System.out.println("in fortune constructor");
	}
	public String getFortune() 
	{
		return "It's your lucky day";
	}
}
