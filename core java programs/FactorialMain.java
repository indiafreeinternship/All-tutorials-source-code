import java.util.Scanner;
class Factorial
{
	int f=1;
	int fact(int n){
		for(int i=n;i>=1;i--){
			f=f*i;
		}
		return f;
	}
}

class FactorialMain 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		Factorial ob=new Factorial();
		int res=ob.fact(n);
		System.out.println("Result " +res);
	}
}
