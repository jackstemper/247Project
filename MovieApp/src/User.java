import java.util.Scanner;

public class User extends Account {
	protected User user;
	protected String Username;
	protected String Password;
	protected Ticket[] Tickets;
	public Ticket[] getTickets() {
		return Tickets;
	}
	public void setTickets(Ticket[] tickets) {
		Tickets = tickets;
	}

	public User() {
		this.Username = "User";
		this.Password = "Default";
	}

	public void createAccount() {
		user.Username = Username;
		user.Password = Password;
	}
	
}
