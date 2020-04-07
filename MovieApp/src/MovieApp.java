import java.util.Arrays;

public class MovieApp {
	protected String Title, Venue;
	protected double Time;
	protected Theater[] Theaters;
	protected Auditorium[] Auditoriums;
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
		// Needs to be done
	}
	public void makeAccount() {
		User user = new User();
		user.createAccount(user);
	}
	public void displayTix() {
		Ticket ticket = new Ticket(Title, Time, Venue);
		ticket.printTicket();
	}
}
