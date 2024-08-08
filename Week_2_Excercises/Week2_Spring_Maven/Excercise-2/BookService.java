package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookrepository;
	public void setBookRepository(BookRepository bookrepository) {
		this.bookrepository=new BookRepository();
	}
    public void disp() {
        System.out.println("Book service enabled");
        bookrepository.disp();
    }
}
