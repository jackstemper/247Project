/*
* Movie Class : Extends Shows class, holds Movie constructor, functions that sets and gets the Lead Actor, 
* prints the movie title as well as the lead actor
*/
public class Movie extends Shows {
	protected String LeadActor;
	public Movie(String title, Double price, Double time, String venue, int capacity, int capacityCounter, String lead) {
		Title = title;
		Price = price;
		Time = time;
		Venue = venue;
		Capacity = capacity;
		CapacityCounter = capacityCounter;
		LeadActor = lead;
	}
	public void setActor(String actor) {
		this.LeadActor = actor;
	}
	public String getActor() {
		return this.LeadActor;
	}
	public void getDetails() {
		System.out.println("The movie " + this.Title + " features " + this.LeadActor +".");
	}
	public void print() {
		System.out.println("Movie name:" +getTitle());
	}
}
