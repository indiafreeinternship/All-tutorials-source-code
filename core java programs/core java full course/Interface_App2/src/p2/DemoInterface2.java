package p2;

import java.util.Scanner;

import p1.GreaterValue;
import p1.SmallerValue;



public class DemoInterface2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value-1");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2");
		int v2 = s.nextInt();
		
		if(v1==v2) {
			System.out.println("Value are equal...");
		}else if(v1<=0 || v2<=0) {
			System.out.println("Invalid value.....");
		}else {
			
			System.out.println("=====Choice======");
			System.out.println("\t1.GreaterValue"
					+ "\n\t2.SmallerValue");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				GreaterValue gv = new GreaterValue();
				int res1 = gv.compareTo(v1, v2);
			    System.out.println("Greater value : "+res1);
				break;
			case 2:
				SmallerValue sv = new SmallerValue();
				int res2 = sv.compareTo(v1, v2);
				System.out.println("Smaller value :"+res2);
				break;
			default:
				System.out.println("Invalid Choice...");
			}//end of switch
		}//end of else
		
		
		
		s.close();
	}

}
