package javaConfig;


public class HockeyCoach implements Coach{
	
	private Fortune fort;
	
	public HockeyCoach(Fortune fort)
	{
		this.fort=fort;
	}

	public String getFortmethod() 
	{
		return fort.getDailyFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "In Hockey Coach";
	}
	
	

}
