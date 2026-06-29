class BTest1
{
	static int x;
	
	static{
		System.out.println("========SubClass Static-block=============");
		System.out.println("The value of x: "+x);
	}
}


class Block2 
{
	public static void main(String[] args) 
	{
		BTest1.x=123;
		System.out.println("============main()==============");
		System.out.println("The value of x: "+BTest1.x);
	}
}
