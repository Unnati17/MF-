package firstIOc;

public class Baseball implements Coach {
	
	private IFortune ifortune;
	
	private String name;
	private String email;
	private String team_name;
	private Address add;
	
//	public Baseball(String name,String email,String team_name,Address add)
//	{
//		this.name=name;
//		this.email=email;
//		this.team_name=team_name;
//		this.add=add;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getDailyWorkout() 
	{
		return "Practice 2 hrs daily";
	}

	public IFortune getIfortune() {
		return ifortune;
	}


	public void setIfortune(IFortune ifortune) {
		System.out.println("Inside setter");
		this.ifortune = ifortune;
		
	}


	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getDailyFortune()
	{
		return ifortune.getFortune();
	}
	
	public String toString()
	{
	return name+" "+email+" "+team_name+" "+add;
	}
	

}
