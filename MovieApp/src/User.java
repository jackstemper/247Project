import org.junit.Test;

import java.util.Scanner;
/*
* User Class : Extends Account, holds tickets of the user, allows user to create account
*/
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
	@Test
	public User createAccount(User user) {
		System.out.println("Enter your desired username: ");
		Username = keyboard.next();
		System.out.println("Enter a password for " + Username + ": ");
		Password = keyboard.next();

		user = new User();
		user.Username = Username;
		user.Password = Password;

		System.out.println("Account created for " + user.Username);
		return user;

	}
	
}
