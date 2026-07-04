package p2;
import java.util.Scanner;
import p1.Add;
import p1.Sub;
import p1.Mul;
import p1.Div;
import p1.ModDiv;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int value -1:");
	    int v1=s.nextInt();
		System.out.println("Enter the inv value -2:");
		int v2=s.nextInt();
		
		if(v1>0 && v2>0){
			System.out.println("==========CHOICE=======");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
			System.out.println("Enter the choice:");
			int choice=s.nextInt();
			
			switch(choice){
				case 1:
					Add ad=new Add();
				   int r1=ad.add(v1,v2);
				   System.out.println("Addition "+r1);
					break;
				case 2:
					Sub sb=new Sub();
					int r2=sb.sub(v1,v2);
					System.out.println("Subtraction "+r2);
					break;
				case 3:
					Mul ml=new Mul();
				    int r3=ml.mul(v1,v2);
					System.out.println("Multiplication "+r3);
					break;
				case 4:
					Div dv=new Div();
				    float r4=dv.div(v1,v2);
					break;
				case 5:
					ModDiv md=new ModDiv();
				    int r5=md.modDiv(v1,v2);
					System.out.println("Mod Division "+r5);
					break;
				default:
					System.out.println("Invalid choice...");
			}
			

			
		}// end of if
		else{
			System.out.println("Invalid values...");
		}

	}

}
