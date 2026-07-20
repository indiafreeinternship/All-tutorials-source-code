package p1;

public class C2 extends C1{
	
	public void m(int a, int b, int c, int d) {
		this.m(a,b,c);
		System.out.println("======CClass m(a,b,c,d)=========");
		System.out.println("The value d: "+d);
	}
	
	public void m(int a,int b,int c) {
		super.m(a, b);
		System.out.println("=======CClass m(a,b,c)=====");
		System.out.println("The value c :"+c);
	}

}
