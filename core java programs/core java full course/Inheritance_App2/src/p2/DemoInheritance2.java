package p2;

import java.util.Scanner;

import p1.C2;

public class DemoInheritance2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		C2 ob = new C2();
		
		System.out.println("Enter the value : ");
		double val = s.nextDouble();
		
		double res = ob.calculate(val);
		
		System.out.println("Result : "+res);
		
		s.close();
		
		

	}

}
