package annoScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b")
@Scope("prototype")
public class B {
	
	private C c;

	public B()
	{
	System.out.println("In class B's constructor");
	}
	
	public C getC() {
		return c;
	}
	@Autowired
	public void setC(C c) {
		this.c = c;
	}


}
