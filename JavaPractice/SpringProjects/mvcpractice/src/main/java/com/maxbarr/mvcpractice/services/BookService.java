package com.maxbarr.mvcpractice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maxbarr.mvcpractice.models.Book;
import com.maxbarr.mvcpractice.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
//	Returns all books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	
}
