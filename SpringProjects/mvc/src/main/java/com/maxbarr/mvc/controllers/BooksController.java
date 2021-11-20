package com.maxbarr.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxbarr.mvc.models.Book;
import com.maxbarr.mvc.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
	
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/{id}")
	public String getBookById(Model model, @PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		
//		String title = "title";
//		String description = "description";
//		String language = "language";
//		String numberOfPages = "numberOfPages";
//		
//		model.addAttribute("title", title);
//		model.addAttribute("description", description);
//		model.addAttribute("language", language);
//		model.addAttribute("numberOfPages", numberOfPages);
		
        return "books/show.jsp";
	}
}
