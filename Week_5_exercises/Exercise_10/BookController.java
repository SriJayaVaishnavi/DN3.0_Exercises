package com.example.BookstoreAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookstoreAPI.service.BookService;
import com.example.Entity.Book;

@RestController
@RequestMapping("/api/v1")
public class BookController {

	private BookService bookservice;
	
	@Autowired
	public BookController(BookService bookservice) {
		this.bookservice=bookservice;
	}
   
	@GetMapping(produces={"application/json","application/xml"})
	public List<Book> getAllBooks(){
		return bookservice.getAllBooks();
	}
	
	@GetMapping("value={id}","produces={"application/json","application/xml"})
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		Optional<Book> book=bookservice.getBookById(id);
		return book.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PutMapping("value={id}","produces={"application/json","application/xml"})
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book){
		Book updatedbook = bookservice.updateBook(id, book);
		return ResponseEntity.ok(updatedbook);		
	}
	
	@DeleteMapping("value={id}","produces={"application/json","application/xml"})
	public ResponseEntity<String> deleteBook(@PathVariable Long id){
		bookservice.deleteBook(id);
		return ResponseEntity.ok("books deleted successfully");
	}
}
