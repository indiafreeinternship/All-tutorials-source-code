package p2;

import java.util.Scanner;

import p1.Addition;

public class DemoInheritance9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Addition ad = new Addition();

		xyz: while(true) {
			System.out.println("========choice========");
			System.out.println("\t1.add(int,int)" + "\n\t2.add(int,int,int)" + "\n\t3.add(int,float)" + "\n\t4.exit(stop)");

			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter int value 1 :");
				int v1 = s.nextInt();
				System.out.println("Enter int value 2 : ");
				int v2 = s.nextInt();
				ad.add(v1, v2);
				break;

			case 2:
				System.out.println("Enter int value 1 :");
				int v11 = s.nextInt();
				System.out.println("Enter int value 2 : ");
				int v22 = s.nextInt();
				System.out.println("Enter int value 3 :");
				int v33 = s.nextInt();

				int res = ad.add(v11, v22, v33);
				System.out.println("Sum : " + res);
				break;

			case 3:
				System.out.println("Enter int value 1 :");
				int v111 = s.nextInt();
				System.out.println("Enter float value 2 : ");
				float v222 = s.nextFloat();
				ad.add(v111, v222);
	           
				break;
			case 4: 
				System.out.println("Program stopped....");
				System.exit(0);
				break xyz;
			
			default:
				System.out.println("Invalid Choice...");
			}//end of switch

		}//end of while loop
		s.close();
	}

}
