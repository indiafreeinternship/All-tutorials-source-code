package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.repo.BookRepository;



@Component
public class Test implements CommandLineRunner {
	

	@Autowired
	private BookRepository repo;

	

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book(101,"Core Java", "B-swamy",250.0);
		Book b2 = new Book(102,"Adv Java", "Mohan",200.0);
		
		Book b3 = new Book(103,"Spring", "Rajeev",500.0);
		Book b4 = new Book(104,"SpringBoot", "Mohit",5000.0);
		Book b5 = new Book(105,"Hibernate", "Rani",3500.0);
		Book b6 = new Book(106,"MySql", "Jiya",2000.0);
		Book b7 = new Book(107,"NodeJs", "Neha",2550.0);
		Book b8 = new Book(108,"UI Java", "Shiva",200.0);
		
		 repo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8));
		
		 /**
		  * ==============================
		  * 1. SIGNLE COLUMN SORTNG -ASC
		  * ==============================
		  */
		    		 
		 Sort s2 = Sort.by("bookCost");
		 Sort s1 = Sort.by(Direction.ASC, "bookName");
		 
		 
		Iterable<Book> itl = repo.findAll(s1);
		//itl.forEach(System.out::println);
		
		/**
		  * ==============================
		  * 2. SIGNLE COLUMN SORTNG -DESC
		  * ==============================
		  */
	
		 Sort s3 = Sort.by(Direction.DESC, "bookCost");
		 
		 		Iterable<Book> itl2 = repo.findAll(s3);
		//itl2.forEach(System.out::println);
		
		
		/**
		  * ====================================================
		  * 3. MULTI-COLUMN SORTNG -SAME TYPE(BOTH ASC/BOTH DESC)
		  * ====================================================
		  */
		
		Sort s4 = Sort.by(Direction.ASC,"bookCost","bookName");
		Iterable<Book> itl3 = repo.findAll(s4);
		//itl3.forEach(System.out::println);
		
		
		/**
		  * ====================================================
		  * 4. MULTI-COLUMN SORTNG -MIXED TYPE(ASC + DESC)
		  * ====================================================
		  */
		    
		Sort s5 = Sort.by(Order.asc("bookCost"),
				Order.desc("bookName"));
		
		Iterable<Book> itl5 = repo.findAll(s5);
		
		itl5.forEach(System.out::println);
		
		
	}
}
