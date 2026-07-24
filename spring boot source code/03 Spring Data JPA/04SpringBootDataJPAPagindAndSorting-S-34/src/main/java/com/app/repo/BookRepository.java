package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.entity.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer>,
CrudRepository<Book, Integer>{

}
