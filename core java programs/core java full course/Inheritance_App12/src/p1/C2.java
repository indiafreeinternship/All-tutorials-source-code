package p1;

public class C2 extends C1 {
	
	public C2(int a,int b,int c,int d) {
		this(a, b, c);
		System.out.println("======CClass C2(a,b,c,d)=======");
		System.out.println("The value of d : "+d);
	}
	
	public C2(int a,int b,int c) {
		super(a,b);
		System.out.println("======CClass C2(a,b,c)=======");
		System.out.println("The value of c : "+c);
	}

}
