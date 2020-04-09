import java.util.Arrays;
import java.util.Scanner;

/*
* MovieDriver class : Holds an array of Home and Venue Options that give the basic functions of the app, runs the 
* function based on the number the user inputs on the home page
*/
public class MovieDriver {
	private Scanner scanner;
	// View shows the Name and Addresses of the theaters in the theaters[]
	// Checkout goes to a theater for Venue Options
	// Make Account makes it so that you can get a ticket[] to save the tickets you get in a session
	// View Tickets shows your tickets
	private String[] HomeOptions = {"View Theaters", "Checkout Theater","Make account", "View Tickets", "Exit"};
	// View Movies should show the Name, Time, and the small description
	// Buy Ticket should increase the capacity counter in the Movie/play, and return a ticket to the account Ticket[]
	// GbttHS is obv, just break out to Home Screen
	private String[] VenueOptions = {"View Movies", "Buy a Ticket", "Go back to the Home Screen"};
	private Theater[] Theaters = new Theater[2];
	protected Auditorium[] Auditoriums;
	private Account[] Accounts = new Account[2];
	protected boolean FALSE = false;
	protected boolean TRUE = true;
	MovieDriver(){
		scanner = new Scanner(System.in);
	}
	
	//loading test movie and theater and user information
	public void load() {
		Movie Frozen = new Movie("Frozen 2", 9.50, 6.50, "AMC", 60, 0, "Elsa");
		Movie Jungle = new Movie("The Jungle Book", 9.50, 5.0, "AMC", 60, 0, "Mowgli");
		Movie[] AMCList = {Frozen, Jungle};
		Theater AMC = new Theater("AMC", "6969 Test Dr.", AMCList);
		Theaters[0]= AMC;
		Movie Matrix = new Movie("The Matrix", 11.50, 8.50, "Carmike", 40, 0, "Neo");
		Movie Community = new Movie("Community: the Movie", 11.50, 7.0,"Carmike", 40, 0, "Abhed");
		Movie[] CarmikeList = {Matrix, Community};
		Theater Carmike = new Theater("Carmike", "457984 Greendale Rd.", CarmikeList);
		Theaters[1] = Carmike;
		Account NewUser = new Account("User", "Default", FALSE);
		Accounts[0] = NewUser;
		Account Manager = new Account("Manager", "Password", TRUE);
		Accounts[1] = Manager;
		//Account[] Accounts = {Guest, Existing, Employee};
	}
	public void viewTheaters() {
		for(int i =0; i<Theaters.length;i++) {
			System.out.println(Theaters[i].getName() + " which is at " + Theaters[i].getAddress());
		}
	}
	
	public void goToTheater(Theater theater) {
		while(true) {
			System.out.println("Welcome to " + theater.getName());
			int userCommand = getAction(VenueOptions.length);
			if(userCommand == VenueOptions.length -1) break;
			switch(userCommand) {
				case(0):
					theater.printMovies();
					break;
				case(1):
					//theater.buyTicket();
					break;
			}
		}
		
	}
	public void managerLogin(){
		Manager manager = new Manager();
		manager.managerLogin();
	}

	public void makeAccount() {
		User user = new User();
		user.createAccount(user);
	}
	public void displayTix() {
		Ticket ticket = new Ticket();
		ticket.printTicket();
	}
	public void run() {
		System.out.println("Loading the App");
		load();
		System.out.println("Welcome to our Columbia Movie Theater App");
		//managerLogin();
		while(true) {
			displayHome();
			int userCommand = getAction(HomeOptions.length);
			if(userCommand == HomeOptions.length -1) {
				System.out.println("Thank you for using our app, sorry it sucks");
				break;
			}
			switch(userCommand) {
				case(0):
					viewTheaters();
					break;
				case(1):
					System.out.println("What theater would you like to enter?:");
					for(int i =0; i<Theaters.length;i++) {
						System.out.println(i+1 +": " +Theaters[i].getName() + " which is at " + Theaters[i].getAddress());
					}
					int theaterSelection = getAction(Theaters.length);
					goToTheater(Theaters[theaterSelection]);
					break;
				case(2):
					makeAccount();
					break;
				case(3):
					displayTix();
					break;
			}
		}
	}
	private void displayHome() {
		System.out.println("--------- Home Page ---------");
		for(int i =0; i< HomeOptions.length; i++) {
			System.out.println("Press " + (i+1) + " for " + HomeOptions[i]);
		}
	}
	private int getAction(int choices) {
		System.out.print("What would you like to do?: ");
		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;
		if(command >= 0 && command <= choices -1) return command;
		return -1;
	}
	
	public static void main(String[] args) {
		MovieDriver MovieDriver = new MovieDriver();
		MovieDriver.run();
	}

}
