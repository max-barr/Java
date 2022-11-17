package com.maxbarr.mvcpractice.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.maxbarr.mvcpractice.models.Book;
import com.maxbarr.mvcpractice.services.BookService;

@Controller
public class BooksController {
	
	private final BookService bookService;
	
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}

}
