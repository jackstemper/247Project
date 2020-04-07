import java.util.Scanner;

public class MovieDriver {
	private Scanner scanner;
	private MovieApp movieApp;
	// View shows the Name and Addresses of the theaters in the theaters[]
	// Checkout goes to a theater for Venue Options
	// Make Account makes it so that you can get a ticket[] to save the tickets you get in a session
	// View Tickets shows your tickets
	private String[] HomeOptions = {"View Theaters", "Checkout Theater","Make account", "View Tickets", "Exit"};
	// View Movies should show the Name, Time, and the small discription
	// Buy Ticket should increase the capacity counter in the Movie/play, and return a ticket to the account Ticket[]
	// GbttHS is obv, just break out to Home Screen
	private String[] VenueOptions = {"View Movies", "Buy a Ticket", "Go back to the Home Screen"};
	
	MovieDriver(){
		scanner = new Scanner(System.in);
		movieApp = new MovieApp();
	}
	public void run() {
		System.out.println("Loading the App");
		movieApp.load();
		System.out.println("Welcome to our Columbia Movie Theater App");
		while(true) {
			displayHome();
			int userCommand = getAction(HomeOptions.length);
			if(userCommand == HomeOptions.length -1) break;
			switch(userCommand) {
				case(0):
					movieApp.viewTheaters();
					break;
				case(1):
					movieApp.goToTheater();
					break;
				case(2):
					movieApp.makeAccount();
					break;
				case(3):
					movieApp.displayTix();
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
