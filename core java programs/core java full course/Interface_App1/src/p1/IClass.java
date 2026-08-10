package p1;

public class IClass implements ITest{

	
	public void dis(int k) // overriding and implemented method
	{  
	   System.out.println("=====Implementation method dis(k)=====");
	   System.out.println("The value k: "+k);
	   System.out.println("The value z: "+z);
		
	}

	
	public void m1(int x) //overriding and implemented method
	{
		System.out.println("=====Implementation method m1(x)=====");
		   System.out.println("The value x: "+x);
		   System.out.println("The value z: "+z);
		
	}
	
	public void m2(int y) // NonOverriding and NonImplemented method
	{
		System.out.println("=====NonImplementation method m2(y)=====");
		   System.out.println("The value y: "+y);
		   System.out.println("The value z: "+z);
	}
	

}
