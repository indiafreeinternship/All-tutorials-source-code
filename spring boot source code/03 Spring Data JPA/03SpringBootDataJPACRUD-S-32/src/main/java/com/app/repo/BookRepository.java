package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Integer>  {

}
