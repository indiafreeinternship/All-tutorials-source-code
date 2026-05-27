class Method{
		static int x;		
                          int y;

static  void m1()
 {
	System.out.println("========static method m1()==========");
	System.out.println("x value "+x);	
        
 }

void m2()
  {
	System.out.println("======= non staic method m2()======");
	System.out.println("x value "+x);
	System.out.println("y value "+y);
  }


public static void main(String[] arg){
    Method ob=new Method();
    Method.m1();
   ob.m2();
   }
}