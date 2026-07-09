package p1;

public class C2 extends C1{
	
	public int x;
	public static int y;
	
	public void m3() {
		System.out.println("=======CClass Instance-m3()========");
		System.out.println("The value of x "+x);
		System.out.println("The value of y "+y);
	}
	
	public static void m4() {
		System.out.println("=======CClass Instance-m4()========");
		//System.out.println("The value of x "+x);
		System.out.println("The value of y "+y);
	}
	
	

}
