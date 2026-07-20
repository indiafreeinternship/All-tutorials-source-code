package p1;

public class C1 {
	
	public void m(int a, int b) {
		this.m(a);
		System.out.println("=======PClass m(a,b)=======");
		System.out.println("The value of b: "+b);
	}
	
	public void m(int a) {
		System.out.println("======PClass m(a)=======");
		System.out.println("Tha value of a :"+a);
	}

}
