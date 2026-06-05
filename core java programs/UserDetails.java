import java.util.Scanner;
class UserDetails
{
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in); // object Scanner
		System.out.println("Enter Username");
		String userName=s.nextLine();
		
		System.out.println("Enter mailId");
		String mailId=s.nextLine();
		
		System.out.println("Enter phone Number");
		Long phNo=s.nextLong();
		
		System.out.println("=======UserDetails==========");
		System.out.println("username :"+userName);
		System.out.println("mailId "+mailId);
		System.out.println("phone Number "+phNo);
	}
}