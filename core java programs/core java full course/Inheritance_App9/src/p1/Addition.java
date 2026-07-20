package p1;

public class Addition {
	
	
	public void add(int x,int y){
		System.out.println("======add(x,y)===========");
		System.out.println("sum: "+(x+y));
	}
	
	
	public int add(int x,int y, int z){
		System.out.println("========add(x,y,z)=======");
		return x+y+z;
	}
	
	public void add(int x,float y){
	 System.out.println("========add(x,y)-----------");
	 System.out.println("sum : "+(x+y));
	}
	

}
