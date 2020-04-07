import java.util.Arrays;

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
