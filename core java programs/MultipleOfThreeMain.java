import java.util.Scanner;
class MultipleOfThree
{
	int sm=0;
	int sum(int n){
		
		for(int i=1;i<=n;i++){
			if(i%3==0){
				sm=sm+i;
			}
		}
		return sm;
	}
}

class MultipleOfThreeMain 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		MultipleOfThree ob=new MultipleOfThree();
		int res=ob.sum(n);
		System.out.println(res);
	}
}
