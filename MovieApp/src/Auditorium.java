import java.util.Arrays;


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
