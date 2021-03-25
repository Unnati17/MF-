package Scope_ques;

public class B
{
	
	private C c;

	public B()
	{
	System.out.println("In class B's constructor");
	}
	
	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

}
