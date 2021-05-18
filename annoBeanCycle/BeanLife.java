package annoBeanCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("blf")
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

	@Autowired
	public void setIfortune(IFortune ifortune) {
		this.ifortune = ifortune;
	}
	
	public String getDailyFortune()
	{
		return ifortune.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("init method call");
	}
	
	@PreDestroy
	public void doMyCleanupStuff()
	{ 
		System.out.println("Destroy method call");
	}

}
