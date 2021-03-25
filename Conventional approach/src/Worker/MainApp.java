
public class MainApp {

	public static void main(String[] args) {
		
		IWorker sw = (IWorker)Factory.getObject() ;
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();

	}

}
