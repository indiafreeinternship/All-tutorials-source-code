package p2;
import java.util.Scanner;
import static p1.STest.*;
import p1.STest;
public class DemoStaticImport {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	STest ob=new STest();
	
	System.out.println("Enter the vaue of a: ");
	ob.a = s.nextInt();
	System.out.println("Enter the value of b:");
	//STest.b=s.nextInt();
	b=s.nextInt();
	
	//STest.dis1();
	dis1();
	ob.dis2();
	}

}
