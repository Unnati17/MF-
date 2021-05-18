package newAOP;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import AOPdemo.DemoConfig;

public class Main
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
       AccountDao theAccountDAO = context.getBean("newacc", AccountDao.class);
       Account acc=context.getBean("acnt",Account.class);
       List<Account> theAccounts = theAccountDAO.findAccounts();
       System.out.println("fininshed call of findacc");
       System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
       
       acc.setName("unnati");
       System.out.println(acc.getName());
       context.close();
    }
}
