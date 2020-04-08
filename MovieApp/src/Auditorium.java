import java.util.Arrays;
/*
* Auditorium Class : extends Venue, intializes PArts Array, sets Array and Displays 
* the Array
*/
public class Auditorium extends Venue {
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


}
