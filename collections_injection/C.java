package collections_injection;

public class C implements IC {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void show() 
	{
		System.out.println("C Show "+x);	
	}

	@Override
	public String toString() {
		return "C [x=" + x + "]";
	}
}
