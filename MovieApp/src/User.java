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
	Scanner keyboard = new Scanner(System.in);

	public User() {
		this.Username = "User";
		this.Password = "Default";
	}

	public User createAccount(User user) {
		System.out.println("/nEnter your desired username: ");
		Username = keyboard.next();
		System.out.println("/nEnter a password for " + Username + ": ");
		Password = keyboard.next();

		user = new User();
		user.Username = Username;
		user.Password = Password;

		return user;

	}
	
}
