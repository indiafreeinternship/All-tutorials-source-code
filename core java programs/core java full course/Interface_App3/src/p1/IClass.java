package p1;

public class IClass implements ITest {

	@Override
	public void m1(int a) {
		System.out.println("=====Implemented m1(a)=========");
		System.out.println("The value of a :"+a);
		
	}

}
