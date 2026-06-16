import java.util.Scanner;
class SumOfDigits
{
	//1+2+3+4+5+6=21
	
	 int sm=0;
	 int sum(int n){
		
		for(int i=1;i<=n;i++){
			sm=sm+i;
		}
		return sm;
	}
}


class SumOfNumberMain
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=s.nextInt();
		SumOfDigits ob=new SumOfDigits();
		int res=ob.sum(n);
		System.out.println("Reslult " +res);
	}
}
