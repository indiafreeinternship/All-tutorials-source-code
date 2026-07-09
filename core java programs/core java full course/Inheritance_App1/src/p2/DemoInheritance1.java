package p2;

import java.util.Scanner;

import p1.C2;

public class DemoInheritance1 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		C2 ob = new C2();// child Class Object
		System.out.println("Enter the value for a :");
		ob.a=s.nextInt();
		System.out.println("Enter the value for b :");
		C2.b=s.nextInt();
		System.out.println("Enter the value for x :");
		ob.x=s.nextInt();
		System.out.println("Enter the value for y :");
		C2.y=s.nextInt();
		
		ob.m1();
		C2.m2();
		ob.m3();
		C2.m4();
		s.close();
		
	}
}
