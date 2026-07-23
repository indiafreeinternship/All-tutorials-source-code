package com.app.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.BookEntity;
import com.app.exception.BookNotFoundException;
import com.app.repo.BookRepository;

import lombok.Lombok;

@Component
public class Test implements CommandLineRunner{
	
	@Autowired
	private BookRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
		BookEntity b1 = new BookEntity(10,"Core Java","B-SWAMY",350.0);
		BookEntity b2 = new BookEntity(11,"Adv Java","B-SWAMY",250.0);
		BookEntity b3 = new BookEntity(11,"Bootstrap","ABC",2000.0);
		repo.save(b1);
		repo.save(b2);
		repo.save(b3);
		
		repo.saveAll(
				Arrays.asList(
				new BookEntity(12,"Spring Boot","Rahul",10000.0),
				new BookEntity(13,"DevOps","MAX",9000.0),
				new BookEntity(14,"ReactJS","KUSUM",8000.0)
				)
				);
		
		
		Iterable<BookEntity> data = repo.findAll();
		
		data.forEach(System.out::println);
		
		//select count(*) from booktab;
		System.out.println(repo.count());
		
		boolean result = repo.existsById(12);
		System.out.println(result);
		//==================PART II================
		
		/*Optional<BookEntity> opt = repo.findById(5);
		
		if(opt.isPresent()) {
			BookEntity bookEntity = opt.get();
			System.out.println(bookEntity);
		}else {
			System.out.println("DATA NOT FOUND");
			throw new BookNotFoundException("BOOK NOT FOUND WITH ID");
		}*/
		
		BookEntity bookEntity = repo.findById(14).orElseThrow(()->new BookNotFoundException("BOOK NOT EXITS WITH ID"));
		
		System.out.println(bookEntity);
		
		repo.deleteById(11);
		//repo.deleteAll();
		repo.delete(bookEntity);
	
	}

}
