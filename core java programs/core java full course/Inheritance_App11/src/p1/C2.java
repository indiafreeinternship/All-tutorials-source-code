package p1;

public class C2 extends C1{
	
	
	
	public static  void m(int a,int b,int c) {
		//super.m(a, b);
		System.out.println("=======CClass m(a,b,c)=====");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
		System.out.println("The value c :"+c);
	}
	
	public static void m(int a, int b, int c, int d) {
		//this.m(a,b,c);
		System.out.println("======CClass m(a,b,c,d)=========");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
		System.out.println("The value c: "+c);
		System.out.println("The value d: "+d);
	}
	
	public void access(int a,int b,int c,int d) {
		super.m(a);
		super.m(a, b);
		this.m(a, b, c);
		this.m(a, b, c, d);
	}

}
