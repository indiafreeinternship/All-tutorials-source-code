package p1;

public class C1 {
	
	public int a;
	public static int b;
	
  public void	m1(){
		System.out.println("==========PClass Instance-m1()==========");
		System.out.println("The value a :"+a);
		System.out.println("The value b : "+b);
		
  }
  
   public static void m2(){
    	System.out.println("========PClass Static-m2()==========");
    	//System.out.println("The value a :"+a);
    	System.out.println("The value b: "+b);
    }

}
