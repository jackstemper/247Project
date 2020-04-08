import java.util.Scanner;
/*
* Shows class : extends MovieApp, holds getters/setters for Show Details (title, price, time, venue, capacity)
*/
public abstract class Shows extends MovieApp {
	protected static String[][] seat = new String[6][10];
	Scanner keyboard = new Scanner(System.in);
	protected String Title;
	protected Double Price;
	protected Double Time;
	protected String Venue;
	protected int Capacity;
	protected int CapacityCounter;
	private int CAPACITYPLUSONE = 1;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Double getTime() {
		return Time;
	}
	public void setTime(Double time) {
		Time = time;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public int getCapacityCounter() {
		return CapacityCounter;
	}
	public void setCapacityCounter(int capacityCounter) {
		CapacityCounter = capacityCounter;
	}
	//buyTicket function : if show has room, allows user to choose the seat, updates capacity counter, if not displays show is full 
	public Ticket buyTicket() {
		if(Capacity>CapacityCounter) {
			chooseSeat();
			Capacity = Capacity+CAPACITYPLUSONE;
		} else {
			System.out.println("The showing is full");
		}
		Ticket retTicket = new Ticket();
		return retTicket;
	}

	/*
	* ChooseSeat function : allows user to choose his/her seat buy reading input of row and collumn #, seats that are full 
	* show a '#' to indicate the user can not pick that seat
	*/
	public void chooseSeat() {
		boolean correctSeat = false;
		while (correctSeat = false) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 10; j++) {
					seat[i][j] = "#";
				}
			}
			for (String[] a : seat) {
				for (String i : a) {
					System.out.print(i + " ");
				}
				System.out.println("\n");
			}

			System.out.println("Choose your seat by entering the number of the desired row followed by desired column: ");
			int row = keyboard.nextInt();
			int column = keyboard.nextInt();
			seat[row][column] = "O";
			System.out.println("/n/n");

			for (String[] a : seat) {
				for (String i : a) {
					System.out.print(i + " ");
				}
				System.out.println("\n");
			}

			System.out.println("/nIs this the seat indicated by an 'O' the seat that you wanted?");
			System.out.println("/nEnter 1 for yes or 2 for no: ");
			int answer = keyboard.nextInt();

			if(answer == 1){
				System.out.println("Your seat is in section " + row + " seat " + column + "/n");
				correctSeat = true;
			}
			else{
				System.out.println("/nYou may now select your seat again./n");
				correctSeat = false;
			}

		}
	}
}
