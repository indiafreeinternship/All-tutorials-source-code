package p1;

public class BookDetails {
    
	public String code;
	public String name;
	public String author;
	public float price;
	
	
	public void getBookDetails(){
		System.out.println("=========BookDetails=======");
		System.out.println("BookCode: "+code);  //ctrl+alt+down Arrow
		System.out.println("BookName: "+name);  
		System.out.println("BookAuthor: "+author);  
		System.out.println("BookPrice : "+price);  
	}
	
}
