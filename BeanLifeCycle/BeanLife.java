package BeanLifeCycle;

public class BeanLife implements Coach{
	private IFortune ifortune;
	
	public BeanLife()
	{
		System.out.println("in constructor");
	}
	
	public String getDailyWorkout()
	{
		return "practice 5 hours daily";
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
		this.ifortune = ifortune;
	}
	
	public String getDailyFortune()
	{
		return ifortune.getFortune();
	}
	
	public void doMyStartupStuff()
	{
		System.out.println("init method call");
	}
	
	public void doMyCleanupStuff()
	{
		System.out.println("Destroy method call");
	}

}
