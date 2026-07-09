package p1;

public class DisplayStudent {

	
	public Student stu=null;
	
	public DisplayStudent(Student stu) {
		this.stu=stu;
	}
	
	public void display() {
		stu.getStudent();
		stu.ct.getContact();
	}
}
