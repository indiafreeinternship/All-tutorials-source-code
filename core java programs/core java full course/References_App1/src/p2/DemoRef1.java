package p2;
import java.util.Scanner;
import p1.CustDetails;
public class DemoRef1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CustDetails cd=new CustDetails();
        System.out.println("Enter custId :");
        cd.custId=s.nextLine();
        System.out.println("Enter custName :");
        cd.custName=s.nextLine();
        System.out.println("Enter the custMailId");
        cd.cc.mailId=s.nextLine();
        System.out.println("Enter the PhoneNo :");
        cd.cc.phNo=s.nextLong();
        
        cd.getCustDetails();
        cd.cc.getCustContact();
       s.close(); 
        
	}

}
