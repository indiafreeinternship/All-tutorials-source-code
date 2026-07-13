package p2;

import p1.C2;

public class DemoInheritance3 {
	public static void main(String[] args) {
		System.out.println("=====Using  Class Name=======");
		C2.m(121);
		
		System.out.println("========Using Object Name ===========");
		C2 ob = new C2();
		ob.m(123);
	}

}
