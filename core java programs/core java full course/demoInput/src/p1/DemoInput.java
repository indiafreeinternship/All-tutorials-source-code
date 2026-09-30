package p1;

import java.util.Scanner;

public class DemoInput {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Train No");
		//int tNo = s.nextInt();
		
		//String tNo=s.nextLine();
		int tNumber = Integer.parseInt(s.nextLine());
		
	
		
		System.out.println("Enter TrainName");
		String tName=s.nextLine();
		
		System.out.println("******Train Details******");
		System.out.println("Train No "+tNumber);
		System.out.println("Train Name "+tName);
		s.close();
	}
}
