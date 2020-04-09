import java.util.Scanner;

/*
* Manager Class : extends Account, holds constructor for class, function that changes the events
*/
public class Manager extends Account {
	protected String Username;
	protected String Password;
	protected boolean IsManager;
	protected Movie[] Movies;
	protected Manager manager;



	protected Manager(){
		Username = "Manager";
		Password = "Password";
		IsManager = true;

	}
	public void managerLogin(){
		Manager manager = new Manager();

		System.out.println("Are you a manager? Enter 1 for yes or 2 for no: ");
		Scanner keyboard = new Scanner(System.in);
		int answer = keyboard.nextInt();
		switch(answer){
			case(1):
				System.out.println("Enter your username: ");
				String user = keyboard.next();
				if(user.equals(manager.Username)){
					System.out.println("Enter your password:");
					String pass = keyboard.next();
					if(pass.equals(manager.Password)){
							managerMenu();
					}
					else{
						System.out.println("Incorrect Password");
						break;
					}
				}
				else{
					System.out.println("Username is not accepted.");
					break;
				}

		}
	}
	public void managerMenu(){
		System.out.println("What would you like to do today?");
		System.out.println("1. Change Events, 2. Exit");
		Scanner keyboard = new Scanner(System.in);
		int option = keyboard.nextInt();

		switch(option){
			case(1):
				System.out.println("Currently I'm trying to figure out how to get the movies here");
			case(2):
				break;

		}
	}

}
