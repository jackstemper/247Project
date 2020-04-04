
public class Movie extends Shows{
	protected String LeadActor;
	public void setActor(String actor) {
		this.LeadActor = actor;
	}
	public String getActor() {
		return this.LeadActor;
	}
	public void getDetails() {
		System.out.println("The movie " + this.Title + " features " + this.LeadActor +".");
	}
}
