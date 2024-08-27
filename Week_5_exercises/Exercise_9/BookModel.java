package com.example.BookstoreAPI;

import org.hibernate.boot.jaxb.hbm.internal.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class BookModel extends RepresentationModel<BookModel>{

	private Long id;
	private String title;
	private String author;
	private Double price;
	private Integer isbn;
	public BookModel() {
		
	}
	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
    public void setPrice(double price) {
    	this.price=price;
    }
    
    public void setAuthor(String author) {
    	this.author=author;
    }
    
    public void setIsbn(int isbn) {
    	this.isbn=isbn;
    }
	

}
