import java.util.Scanner;
class BookDetails 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the BookName: ");
		String name=s.nextLine();
		System.out.println("Enter the BookAuthor: ");
		String author=s.nextLine();
		System.out.println("Enter the BookPrice: ");
		int price=s.nextInt();
		System.out.println("Enter the bookQty");
		int qty=s.nextInt();
		System.out.println("==========BOOK DETAILS============");
		System.out.println("BookName "+name);
		System.out.println("BookAuthor "+author);
		System.out.println("BookPrice "+price);
		System.out.println("BookQty "+qty);
	
	}
}
