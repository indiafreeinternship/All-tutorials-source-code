package p2;

import p1.IClass;
import p1.ITest;

public class DemoInterface3 {
	
	public static void main(String[] args) {
		
		IClass ob=new IClass();  //Implemented Object
		ob.m1(11);
		//IClass.m2(12); // Error
		
		ITest.m2(12); // Static concrete method call
		
		ob.m3(13); // default concrete method call
		
				
	}

}
