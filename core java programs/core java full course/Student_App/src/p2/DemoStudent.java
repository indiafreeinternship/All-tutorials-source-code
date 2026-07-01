package p2;
import java.util.Scanner;
import p1.StudentData;
import p1.StudentContact;
public class DemoStudent {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentData sd=new StudentData();
		System.out.println("Enter the RollNo");
		sd.rollNo=s.nextLine();
		System.out.println("Enter the name");
		sd.name=s.nextLine();
		System.out.println("Enter the Branch");
		sd.br=s.nextLine();
		
		StudentContact sc=new StudentContact();
		System.out.println("Enter the mailId");
		sc.mailId=s.nextLine();
		System.out.println("Enter the PhoneNo");
		sc.phNo=s.nextLong();
		
		sd.getStudentData();
		sc.getStudentContact();
	}

}
