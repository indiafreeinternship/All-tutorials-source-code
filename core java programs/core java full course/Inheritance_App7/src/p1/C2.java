package p1;

public class C2 extends C1 {
	
	public static int b;
	
	static {
		System.out.println("==========CClass Static Block=====");
		System.out.println("The value a : "+a);
		System.out.println("The value b: "+b);
	}

}
