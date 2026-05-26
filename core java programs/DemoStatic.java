class DemoStatic{
       
	static int a=10;
                  int b=20;
    
	public static void main(String args[]){
            int c=30;

        System.out.println("a value "+DemoStatic.a);
        DemoStatic ob=new DemoStatic();
        System.out.println("b value "+ob.b);
        System.out.println("c value "+c);
     
    }
}