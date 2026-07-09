package p2;

import java.util.Scanner;

import p1.DisplayStudent;
import p1.LoadStudent;
import p1.Student;

public class DemoRef4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		LoadStudent ls = new LoadStudent(stu);
		DisplayStudent ds = new DisplayStudent(stu);
		
		ls.load(s);
		ds.display();
		
		s.close();

	}

}
