package p1;

public class SmallerValue implements IComparable {

	@Override
	public int compareTo(int x, int y) {
		if(x<y)return x;
		else return y;
		
	}

}
