import java.util.Scanner;
class Student
{
	String rollNo,name,branch;
	
	void getStudent(){
		System.out.println("============Student Details==========");
		System.out.println("Student rollNO "+rollNo);
		System.out.println("Student name "+name);
		System.out.println("Student branch "+branch);
	}
	 
}

class Constructor4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Student ob=new Student();// Con_Call
		System.out.println("Enter the RollNo");
		/*String rNo=s.nextLine();
		ob.rollNo=rNo;*/
		
		ob.rollNo=s.nextLine();
		System.out.println("Enter the Student Name");
		ob.name=s.nextLine();
		System.out.println("Enter the Student branch");
		ob.branch=s.nextLine();
		ob.getStudent();
		
	}
}
