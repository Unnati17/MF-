import java.util.ResourceBundle;

public class Factory {
	
	private static ResourceBundle rb=ResourceBundle.getBundle("config");
	
	private Factory() {}
	
	static IWorker getObject()
	{
		Object object=null;
		String className=rb.getString("classname");

	try
	{
		object=Class.forName(className).getDeclaredConstructor().newInstance();
		
	}
	catch(Exception e) 
	{
	}//object creation required exception handling
	return (IWorker) object;
	}
}
//	public static IWorker getObject()
//	{
//		return new LazyWorker();
//	}


