package SpellCheckerPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
public static void main(String[] args) {
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("SpellSpring.xml");
		
	TextEditor te=(TextEditor)ac.getBean("teditor");
	te.
}

}
