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
	
	
	//===========Parameterized Query===========
	@Query("select B from Book B where B.bookId=?1 and B.bookAuthor=?2")
	Book getDataA(Integer id,String auth );
	
	@Query("select B from Book B where B.bookId=:id and B.bookAuthor=:auth")
	Book getDataB(Integer id,String auth );
	
	
	@Query("select B from Book B where B.bookName=:bname or B.bookCost=:bcost")
	public List<Book> getDataC(String bname,Double bcost);
	
	

}
