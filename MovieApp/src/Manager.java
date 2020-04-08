
public class Manager extends Account {
	protected Manager manager;
	protected String Username;
	protected String Password;
	protected boolean IsManager;
	protected Movie[] Movies;
	
	public void changeEvent() {
		return;
	}

	public Manager() {
		this.Username = "Manager";
		this.Password = "Password";
		IsManager = true;
	}
}
