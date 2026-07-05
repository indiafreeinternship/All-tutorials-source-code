package p1;

public class DisplayBookDetails {

	public BookDetails bd=null;
	
	public DisplayBookDetails(BookDetails bd) {
		this.bd=bd;
		
	}
	
	public void display(){
		bd.getBookDetails();
	}
}
