import java.util.Arrays;
/*
* MovieApp Class : Extends Shows class , holds function that views Theaters , finds the address of the theaters , 
* makes a new user an account, prints a users ticket
*/
public class MovieApp {
	protected Theater[] Theaters;
	protected Auditorium[] Auditoriums;
	
	//loading test movie and theater information
	public void load() {
		Movie Frozen = new Movie("Frozen 2", 9.50, 6.50, "AMC", 60, 0, "Elsa");
		Movie Jungle = new Movie("The Jungle Book", 9.50, 5.0, "AMC", 60, 0, "Mowgli");
		Movie[] AMCList = {Frozen, Jungle};
		Theater AMC = new Theater("AMC", "6969 Test Dr.", AMCList);
		Movie Matrix = new Movie("The Matrix", 11.50, 8.50, "Carmike", 40, 0, "Neo");
		Movie Community = new Movie("Community: the Movie", 11.50, 7.0,"Carmkie", 40, 0, "Abhed");
		Movie[] CarmikeList = {Matrix, Community};
		Theater Carmike = new Theater("Carmike", "457984 Greendale Rd.", CarmikeList);
	}
	public void viewTheaters() {
		System.out.println(Arrays.toString(Theaters));
	}
	public void goToTheater() {
		Venue venue = new Venue();
		venue.getAddress();
	}
	public void makeAccount() {
		User user = new User();
		user.createAccount(user);
	}
	public void displayTix() {
		Ticket ticket = new Ticket();
		ticket.printTicket();
	}
}
