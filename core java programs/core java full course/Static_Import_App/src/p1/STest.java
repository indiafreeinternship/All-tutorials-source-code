package p1;

public class STest {
      
	public  int a;
	public static int b;
	
	public static void dis1() {
		System.out.println("=========static dis1()==========");
		System.out.println("The value of b : "+b);
	}
	
	public void dis2() {
		System.out.println("===========Instance dis2()=========");
		System.out.println("The value of a : "+ a);
		System.out.println("The value of b : "+b);
	}
	
	
}
