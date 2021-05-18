package annoScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c")
@Scope("singleton")
public class C {
	
	public C()
	{
		System.out.println("In class C's constructor");
	}
	

}
