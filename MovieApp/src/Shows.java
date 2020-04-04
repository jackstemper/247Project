
public abstract class Shows {
	protected String Title;
	protected Double Price;
	protected Double Time;
	protected int Capacity;
	protected int CapacityCounter;
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
		Ticket retTicket = new Ticket(this.Title);
		retTicket.setTime(Time);
		//Not a hundred percent sure on how this should be done. Basically I want it to get the venue its already in but the show doesn't have that info I dont think.
		//retTicket.setVenue(this.venue);
		return retTicket;
	}
}
