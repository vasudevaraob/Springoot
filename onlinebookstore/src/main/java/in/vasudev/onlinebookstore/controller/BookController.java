/*  package in.vasudev.onlinebookstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vasudev.onlinebookstore.entity.BookCategory;
import in.vasudev.onlinebookstore.repository.BookRepository;

@RestController
@RequestMapping("/api/v1")
public class BookController{
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping(name="/books")
	public List<BookCategory> getBookDetails(){
		 return bookRepository.findAll();	
	}
	
	@PostMapping("/books")
	public BookCategory saveBook(@Valid @RequestBody BookCategory bookCategory) {
		return bookRepository.save(bookCategory);
	}
}
*/