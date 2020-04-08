import java.util.Arrays;
/*
* MovieApp Class : gets/sets Concerts, holds function that displays details of the concerts array
*/
public class ConcertHall extends Venue {
	protected Concert[] Concerts;
	public Concert[] getConcerts() {
		return Concerts;
	}
	public void setConcerts(Concert[] concerts) {
		Concerts = concerts;
	}
	public void displayInfo() {
		System.out.println(Arrays.toString(Concerts));
	}


}
