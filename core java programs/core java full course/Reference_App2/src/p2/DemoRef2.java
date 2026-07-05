package p2;

import java.util.Scanner;

import p1.BookDetails;
import p1.DisplayBookDetails;
import p1.LoadBookDetails;

public class DemoRef2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookDetails bd=new BookDetails();//Con_call
		
		LoadBookDetails lbd=new LoadBookDetails(bd);// Con_Call
		 DisplayBookDetails dbd=new DisplayBookDetails(bd);//Con_Call
		 
		 lbd.load(s);
		 dbd.display();
	}

}
