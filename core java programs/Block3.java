class BTest2
{
	int x;
	static int y;
	{
		x++;
		y++;
		System.out.println("===========Subclass Instance-block===========");
		System.out.println("The value of x: "+x);
		System.out.println("The value of y: "+y);
	}
	
}
class Block3 
{
	public static void main(String[] args) 
	{
		System.out.println("----------Object1----------");
		BTest2 ob1=new BTest2();
		System.out.println("------Object2--------------");
		BTest2 ob2=new BTest2();
	}
}
