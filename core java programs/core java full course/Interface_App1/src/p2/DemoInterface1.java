package p2;

import p1.ITest;
import p1.IClass;
public class DemoInterface1 {
	
	public static void main(String[] args) {
		
		//ITest ob=new ITest();
		
		IClass ob=new IClass();
		
		ob.dis(12);
		ob.m1(13);
		ob.m2(14);
	}

}
