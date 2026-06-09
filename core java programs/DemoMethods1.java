import java.util.Scanner;
class GreaterValue
{
	int greater(int x,int y){
		if(x>y){
			return x;
		}else{
			return y;
		}
	}
}

class DemoMethods1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int value-1:");
		int v1=s.nextInt();
		System.out.println("Enter the int value-2:");
		int v2=s.nextInt();
		GreaterValue gv=new GreaterValue();
		int res=gv.greater(v1,v2);
		System.out.println("Greater Value : "+res);
	}
}
