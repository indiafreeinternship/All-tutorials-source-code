package p1;

import java.util.Scanner;

public class LoadUserDetails {

	
	public UserDetails ud=null;
	
   public void setUserDetails(UserDetails ud){
		this.ud=ud;
	}
   
   public void load(Scanner s) {
	   System.out.println("Enter the UserName ");
	   ud.userName=s.nextLine();
	   System.out.println("Enter the MailId");
	   ud.mailId=s.nextLine();
	   System.out.println("Enter the phoneNo");
	   ud.phNo=s.nextLong();
   }
}
