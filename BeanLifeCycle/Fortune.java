package BeanLifeCycle;

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
