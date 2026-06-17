import java.util.Scanner;
class Reverse
{
	int r=0;
	
	int rev(int n){
		
		while(n>0){
			int k=n%10;
			r=(r*10)+k;
			n=n/10;
		}
		return r;
	}
}
 
class ReverseMain 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int v1=s.nextInt();
		Reverse ob=new Reverse();
		int res=ob.rev(v1);
		System.out.println("Reverse number "+res);
	}
}
