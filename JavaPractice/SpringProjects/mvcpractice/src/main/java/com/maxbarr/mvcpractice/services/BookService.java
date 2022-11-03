package com.maxbarr.mvcpractice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.mvcpractice.models.Book;
import com.maxbarr.mvcpractice.repositories.BookRepository;

@Service
public class BookService {

//	Injecting book repository
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
//	Returns all books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
//	Creates new book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
//	Retrieves book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
}
