/*
* Manager Class : extends Account, holds constructor for class, function that changes the events
*/
public class Manager extends Account {
	protected Manager manager;
	protected Manager[] managers = new Manager[1];
	protected String Username;
	protected String Password;
	protected boolean IsManager;
	protected Movie[] Movies;



	protected Manager(Manager manager){
		manager.Username = "Manager";
		manager.Password = "Password";
		manager.IsManager = true;

	}

}
