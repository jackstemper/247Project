
public class User extends Account{
	protected Ticket[] Tickets;
	public Ticket[] getTickets() {
		return Tickets;
	}
	public void setTickets(Ticket[] tickets) {
		Tickets = tickets;
	}
	
}
