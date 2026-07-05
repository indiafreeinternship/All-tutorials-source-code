package p1;

public class DisplayUserDetails {

	
	public UserDetails ud=null;
	
	public void setUserDetails(UserDetails ud) {
		this.ud=ud;
	}
	
	public void display() {
		ud.getUserDetails();
	}
}
