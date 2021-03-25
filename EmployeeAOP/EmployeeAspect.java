package EmployeeAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	
	@Before("execution(public void getName())")
	public  void gettingName()
	{
		System.out.println("Before getname method");
	}
	
	@After("execution(public String setName())")
	public void settingName()
	{
		System.out.println("After setname method");
	}
	
	@Around("execution(public long cal_sal())")
	public void calculating_sal()
	{
		System.out.println("Around cal_sal method");
	}
}
