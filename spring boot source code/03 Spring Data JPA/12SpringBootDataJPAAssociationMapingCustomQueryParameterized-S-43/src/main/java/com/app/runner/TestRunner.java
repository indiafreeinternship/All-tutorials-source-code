package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.repository.BookRepository;

@Component
public class TestRunner implements CommandLineRunner{
	
	@Autowired
	private BookRepository brepo;
	
	@Override
	public void run(String... args) throws Exception {
		
	/*	Book b1 = new Book(10,"Core java",400.0,"B-swamy","BackEnd");
		Book b2 = new Book(11,"Adv java",200.0,"B-swamy","BackEnd");
		Book b3 = new Book(12,"Spring Boot",1000.0,"Raj","Framework");
		Book b4 = new Book(13,"HTML",250.0,"Mosaic","FrontEnd");
		Book b5 = new Book(14,"CSS",500.0,"Govind","FrontEnd");
		Book b6 = new Book(15,"React",450.0,"Kumar","FrontEnd");
		
		brepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
		
		/*brepo.getAllBooks().forEach(System.out::println);
		System.out.println("================================================");
		
		brepo.getAllBookNames().forEach(System.out::println);
		
		System.out.println("==========================================");
		brepo.getBookAuthAndBookCost()
		.stream()
		.map(b-> b[0]+"-----"+b[1])
		.forEach(System.out::println);*/
		
		
		Book data = brepo.getDataA(10, "b-swamy");
		System.out.println(data);
		System.out.println("=========================");
		
		Book data2 = brepo.getDataB(12, "Raj");
		System.out.println(data2);
		
		System.out.println("-------------------------");
		brepo.getDataC("html", 200.0).forEach(System.out::println);
		
		
		
		
	}

}
