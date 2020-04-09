/*
* Account Class : extends MovieApp, functions for setting and getting the username 
* and password
*/
public class Account{
	protected String Username;
	protected String Password;
	protected boolean IsManager;
	public Account(){

	}
	public Account(String username, String password, boolean isManager) {
		Username = username;
		Password = password;
		IsManager = isManager;
	}
	public void setUsername(String username) {
		this.Username = username;
	}
	public String getUsername() {
		return this.Username;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public void setManger(boolean isManager) {
		this.IsManager = isManager;
	}
	public boolean isManager() {
		return this.IsManager;
	}
	public User createAccount;
}
