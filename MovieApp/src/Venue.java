/*
* Venue Class : extends MovieApp, functions for setting and getting the Address and 
* Name of Venue
*/
public class Venue extends MovieApp{
	protected String Address;
	protected String Name;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	
}
