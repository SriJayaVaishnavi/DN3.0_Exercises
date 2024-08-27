package com.example.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=1,max=255)
	private String title;
	
	@NotNull
	@Size(min=1,max=255)
	private String author;
	
	@NotNull
	@Size(min=1,max=255)
	private double price;
	
	@NotNull
	@Size(min=1,max=255)
	private int isbn;
	
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
