/*
* Ticket Class : holds getters/seters for title , time , venue, prints ticket
*/
public class Ticket extends MovieApp {
	protected String Title;
	protected Double Time;
	protected String Venue;
	private int BORDERBUFFER = 4;
	public Ticket() {
		this.Title = Title;
		this.Time = Time;
		this.Venue = Venue;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public void setTime(Double time) {
		this.Time = time;
	}
	public void setVenue(String venue) {
		this.Venue = venue;
	}
	public String getTitle() {
		return this.Title;
	}
	public Double getTime() {
		return this.Time;
	}
	public String getVenue() {
		return this.Venue;
	}
	public void printTicket() {
		this.ticketBorderMaker();
		System.out.println("* " + this.getTitle() + " *");
		System.out.println("* " + this.getTime() + " *");
		System.out.println("* " + this.getVenue() + " *");
		this.ticketBorderMaker();
	}
	private void ticketBorderMaker() {
		int titleLength = this.Title.length();
		int venueLength = this.Venue.length();
		if (titleLength >= venueLength) {
			int starTotal = titleLength + BORDERBUFFER;
			System.out.println();
			while(starTotal > 0) {
				System.out.print("*");
				starTotal-=1;
			}
			
		} else {
			int starTotal = venueLength + BORDERBUFFER;
			System.out.println();
			while(starTotal > 0) {
				System.out.print("*");
				starTotal-=1;
			}
		}
	}
}
