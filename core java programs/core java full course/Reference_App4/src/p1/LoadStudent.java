package p1;

import java.util.Scanner;

public class LoadStudent {
	
	public Student stu=null;
	
	public LoadStudent(Student stu) {
		this.stu=stu;
	}
	
	public void load(Scanner s) {
		System.out.println("Enter the student RollNo :");
		stu.rollNo=s.nextLine();
		System.out.println("Enter the Student Name : ");
		stu.name=s.nextLine();
		System.out.println("Enter the student branch");
		stu.br=s.nextLine();
		System.out.println("Enter the student mailId:");
		stu.ct.mailId=s.nextLine();
		System.out.println("Enter the student PhoneNo ");
		stu.ct.phNo=s.nextLong();
		
	}

}
