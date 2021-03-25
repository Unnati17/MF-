package Scope_ques;

public class A
{
	
	private B b;
	
	public A()
	{
		System.out.println("In class A's constructor");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
}
