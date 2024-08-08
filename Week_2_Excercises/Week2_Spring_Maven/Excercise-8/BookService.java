package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookrepository;
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


