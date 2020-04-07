
public abstract class Account extends MovieApp{
	protected String Username;
	protected String Password;
	protected boolean IsManager;
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
