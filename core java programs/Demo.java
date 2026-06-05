class Demo
{
	
	 static int sum(int a,int b)
   {
	int c=a+b;
	return c;
   }
   
    static void mul(int x, int y){
		int z=x*y;
		
    }

	public static void main(String[] args){
		System.out.println("Session 17");
		int result=Demo.sum(10,20);
		System.out.println(result);
		
		//int mulResult=Demo.mul(2,3); error
		//System.out.println(mulResult); 
		
	}
}