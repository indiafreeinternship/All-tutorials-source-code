package p1;

public class GreaterValue implements IComparable {
	

	
	@Override
	public int compareTo(int x, int y) {
		
	/*	if(x>y) {
			return x;
		}else {
			return y;
		}*/
		
		if(x>y) return x;
		else return y;
		
		
		
	}
}
