package com.example.BookstoreAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookstoreAPI.repository.BookRepository;
import com.example.Entity.Book;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.transaction.Transactional;

@Service
public class BookService {
 private static BookRepository bookrepository = null;
 private MeterRegistry meterregistry;
 
 
 @Autowired
 public BookService(MeterRegistry meterregistry) {
	 this.meterregistry=meterregistry;
 }
 
 public void recordBookSale() {
	 meterregistry.counter("book.sales").increment();
 }
 public static List<Book> getAllBooks(){
	 return bookrepository.findAll();
 }
 
 public Optional<Book> getBookById(Long id){
	 return bookrepository.findById(id);
 }
 
 @Transactional
 public Book addBook(Book book) {
	 return bookrepository.save(book);
 }
 
 @Transactional
 public Book updateBook(Long id,Book book) {
	 if(bookrepository.existsById(id)) {
		 book.setId(id);
		 return bookrepository.save(book);
	 }
	 return null;
 }
 
 @Transactional
 public void deleteBook(Long id) {
	 bookrepository.deleteById(id);
 }
}
