
public abstract class Shows {
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
	public Ticket buyTicket() {
		if(Capacity>CapacityCounter) {
			Capacity = Capacity+CAPACITYPLUSONE;
		} else {
			System.out.println("The showing is full");
		}
		Ticket retTicket = new Ticket(this.Title, this.Time, this.Venue);
		return retTicket;
	}
}
