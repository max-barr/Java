package com.maxbarr.mvcpractice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maxbarr.mvcpractice.models.Book;
import com.maxbarr.mvcpractice.services.BookService;

@RestController
public class BooksApi {
//	import service
	private final BookService bookService;
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
//	Show all books
	@GetMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
//	Create a new book
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
//	Show single book
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
//	Update a book
	@PutMapping("/api/books/{id}")
	public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
		return book;
	}
	
//	Delete a book
	@DeleteMapping("/api/books/{id}")
	public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
	
	

}
