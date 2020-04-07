import java.util.Arrays;
import java.util.Scanner;

public class Auditorium extends Venue {
	Scanner keyboard = new Scanner(System.in);
	protected PArts[] PArts;
	public PArts[] getPArts() {
		return PArts;
	}
	public void setPArts(PArts[] pArts) {
		PArts = pArts;
	}
	public void displayInfo() {
		System.out.println(Arrays.toString(PArts));
	}
	protected static String[][] seat = new String[8][8];


	public void chooseSeat() {
		boolean correctSeat = false;
		while (correctSeat = false) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
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

			System.out.println("/n/n");

			seat[row][column] = "O";

			for (String[] a : seat) {
				for (String i : a) {
					System.out.print(i + " ");
				}
				System.out.println("\n");
			}

			System.out.println("/nIs this the seat indicated by an 'O' the seat that you wanted?");
			System.out.println("/nEnter 1 for yes or 2 for no: ");
			String answer = keyboard.next();

			if(answer == "yes"){
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
