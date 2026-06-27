import java.util.Scanner;
class CourseDetails
{
	String id;
	String name;
	int duration;
	float fee;
	
	void setId(String id){
		this.id=id;
	}
	
	String getId(){
		return id;
	}

	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}
	
	void setDuration(int duration){
		this.duration=duration;
	}
	
	int getDuration(){
		return duration;
	}
	
	void setFee(float fee){
		this.fee=fee;
	}
	float getFee(){
		return fee;
	}
	

	
}

class Constructor5
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		CourseDetails ob=new CourseDetails();
		System.out.println("Enter the CourseId");
		ob.setId(s.nextLine());
		System.out.println("Enter the CousreName");
		ob.setName(s.nextLine());
		System.out.println("Enter the CourseDuration");
		ob.setDuration(s.nextInt());
		System.out.println("Enter the CourseFee");
		ob.setFee(s.nextFloat());
		System.out.println("========CousreDetails=========");
		System.out.println("CourseID "+ob.getId());
		System.out.println("CourseName "+ob.getName());
		System.out.println("CousreDuration "+ob.getDuration());
		System.out.println("CourseFee "+ob.getFee());
		
		
	}
}
