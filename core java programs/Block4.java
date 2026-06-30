
class BTest4
{
	
	BTest4(){
		System.out.println("=========Constructor=======");
	}
	
	{
		System.out.println("=========Instance-Block====");
	}
	
	static{
		
		System.out.println("========Static block=======");
	}
}

class Block4 
{
	public static void main(String[] args) 
	{
		System.out.println("=====Object1========");
		BTest4 ob1=new BTest4();
		System.out.println("=====Object2=========");
		BTest4 ob2=new BTest4();
	}
}
