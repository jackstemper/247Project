/*
* PArts Class : extends Shows, functions for setting and getting the Group performing,
* prints details of the shows title and the group performing 
*/
public class PArts extends Shows {
	protected String Group;
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public void getDetails() {
		System.out.println("The show " + this.Title + " is preforemed by " + this.Group +".");
	}
}
