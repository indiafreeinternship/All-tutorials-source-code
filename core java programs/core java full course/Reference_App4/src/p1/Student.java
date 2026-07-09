package p1;

public class Student {
	
	public String rollNo;
	public String name;
	public String br;
	
	public Contact ct=new Contact();
	
	public void getStudent() {
		System.out.println("========StudentDetails==========");
		System.out.println("Student RollNO : "+rollNo);
		System.out.println("Student Name : "+ name);
		System.out.println("Student branch : "+br);
	}

}
