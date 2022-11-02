package com.maxbarr.mvcpractice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxbarr.mvcpractice.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
