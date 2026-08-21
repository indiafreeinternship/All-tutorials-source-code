package p1;

public interface ITest {
	
	private void m1(int a)
	{
		System.out.println("******private m1(a)**********");
		System.out.println("The value a :"+a);
	}
	
	private static void m2(int b) 
	{
		System.out.println("******private m2(b)*******");
		System.out.println("The value b: "+b);
	}
	
	public default void access(int a,int b)
	{
		this.m1(a);
		ITest.m2(b);
	}

}
