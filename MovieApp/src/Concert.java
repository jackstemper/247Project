/*
* Concert Class : Extends Shows class, gets/sets Band, holds function that displays details of the concert title 
* and featured band
*/
public class Concert extends Shows {
	protected String Band;
	public String getBand() {
		return Band;
	}
	public void setBand(String band) {
		Band = band;
	}
	public void getDetails() {
		System.out.println("This concert " + this.Title + " features the band" + this.Band +".");
	}
}
