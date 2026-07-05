package p2;

import java.util.Scanner;

import p1.DisplayUserDetails;
import p1.LoadUserDetails;
import p1.UserDetails;

public class DemoRef3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		UserDetails ud = new UserDetails();
		LoadUserDetails lud = new LoadUserDetails();
		DisplayUserDetails dud = new DisplayUserDetails();
		
		lud.setUserDetails(ud);
		dud.setUserDetails(ud);
		lud.load(s);
		dud.display();
		s.close();
		
	}

}
