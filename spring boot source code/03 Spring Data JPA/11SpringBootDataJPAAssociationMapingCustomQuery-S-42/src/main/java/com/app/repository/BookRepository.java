package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	
	//@Query("select B from com.app.entity.Book B")
	//@Query("SELECT B FROM Book B")
	@Query("FROM Book")
	List<Book> getAllBooks();
	
	@Query("SELECT B.bookName FROM Book B")
	List<String> getAllBookNames();
	
	@Query("select B.bookAuthor, B.bookCost FROM Book B")
	List<Object[]> getBookAuthAndBookCost();
	

}
