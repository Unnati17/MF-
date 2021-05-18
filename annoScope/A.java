package annoScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("a")
@Lazy(true)
@Scope("singleton")
public class A {
	
private B b;
	
	public A()
	{
		System.out.println("In class A's constructor");
	}

	public B getB() {
		return b;
	}
	
	@Autowired
	public void setB(B b) {
		this.b = b;
	}
	
	

}
