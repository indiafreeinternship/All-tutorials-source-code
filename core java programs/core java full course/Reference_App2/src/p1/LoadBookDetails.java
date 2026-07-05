package p1;
import java.util.Scanner;
public class LoadBookDetails {

	
	public BookDetails bd=null;
	
	public LoadBookDetails(BookDetails bd){
		this.bd=bd;
	}
	
	public void load(Scanner s){
		System.out.println("Enter the BookCode");
		bd.code=s.nextLine();
		System.out.println("Enter the BookName");
		bd.name= s.nextLine();
		System.out.println("Enter the BookAuthor");
		bd.author=s.nextLine();
		System.out.println("Enter the BookPrice");
		bd.price=s.nextFloat();
		
	}
}
