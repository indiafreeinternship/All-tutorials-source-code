package com.app.repo;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Integer>  {

}
