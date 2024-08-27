package com.example.BookstoreAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookstoreAPI.BookModel;
import com.example.BookstoreAPI.service.BookService;
import com.example.Entity.Book;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@Autowired
	public BookController(BookService bookservice) {
		this.bookservice=bookservice;
	}
   
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		Optional<Book> book=bookservice.getBookById(id);
		if(book.isPresent()) {
			BookModel bookModel=new BookModel();
			bookModel.setId(book.get().getId());
			bookModel.setTitle(book.get().getTitle());
		    bookModel.setAuthor(book.get().getTitle());
		    bookModel.setPrice(book.get().getPrice());
		    bookModel.setIsbn(book.get().getIsbn());
		
		    
		    WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(id)).withRel();
		    bookModel.add(link);
		    WebMvcLinkBuilder booklink=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getAllBooks()).withRel("all-books");
		    bookModel.add(booklink);
		    
		    return ResponseEntity.ok(bookModel);
		 
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/books")
	public ResponseEntity<Book> getAllBooks(@PathVariable Long id){
		List<Book> books= BookService.getAllBooks();
		List<BookModel> bookModel=books.stream().map(book ->{)
			BookModel bookmodel=new BookModel();
		    bookmodel.setId(book.getId());
		    bookmodel.setTitle(book.getTitle());
		    bookmodel.setAuthor(book.getAuthor());
		    bookmodel.setPrice(book.getPrice());
		    bookmodel.setIsbn(book.getIsbn());
		    
		    Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).getBookById(book.getId())).withSelfRel();
		    bookmodel.add(selfLink);
		    
		    return bookmodel;
		}).collect(Collectors.toList());
		
		return ResponseEntity.ok(bookModels);
		
	}
	
	
}
