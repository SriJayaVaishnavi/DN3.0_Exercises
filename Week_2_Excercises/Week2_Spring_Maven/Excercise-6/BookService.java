package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {
	private BookRepository bookrepository;
	
	@Autowired
	public BookService(BookRepository bookrepository){
		this.bookrepository=bookrepository;
	}
	public  BookService() {}
	public void setBookRepository(BookRepository bookrepository) {
		this.bookrepository=bookrepository;
	}
	
	
    public void disp() {
        System.out.println("Book service enabled");
        bookrepository.disp();
    }
}


