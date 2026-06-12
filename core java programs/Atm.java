import java.util.Scanner;
class WithDraw
{
	void wDraw(int amt,float bal){
		if(amt<=bal){
			System.out.println("Amt withDraw : "+amt);
			System.out.println("Balance Amt : "+(bal-amt));
			System.out.println("Transaction Successfull...");
		}else{
			System.out.println("Insufficient fund...");
		}
	}
}

class Deposit
{
	void deposit(int amt,float bal){
		System.out.println("Amt deposited :"+amt);
		System.out.println("Balance Amt : "+(bal+amt));
		System.out.println("Transaction Successfull..");
	}
}

class Atm 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		float bal=3000.0F;
		System.out.println("====choice=======");
		System.out.println("1. WithDraw \n2. Deposit");
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter the amount");
			    int a1=s.nextInt();
				if(a1>0 && a1%100==0){
					WithDraw wd=new WithDraw();
					wd.wDraw(a1,bal);
					
					
				}else{
					System.out.println("invalid amt..");
				}
				break;
			case 2:
				System.out.println("Enter the amt");
			    int a2=s.nextInt();
				if(a2>0 && a2%100==0 ){
					
				Deposit dp=new Deposit();
				dp.deposit(a2,bal);
				
				
				
				}else{
					System.out.println("invalid amt...");
				}
				
				break;
			default:
				System.out.println("Invalid choice...");
				
		}
		
		
	}
}
