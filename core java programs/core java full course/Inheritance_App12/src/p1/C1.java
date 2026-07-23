package p1;

public class C1 {
	
	public C1(int a,int b) {
		this(a);
		System.out.println("======PClass C1(a,b)=======");
		System.out.println("The value of b : "+b);
	}
	
	public C1(int a) {
		System.out.println("======PClass C1(a)=======");
		System.out.println("The value of a : "+a);
	}

}
