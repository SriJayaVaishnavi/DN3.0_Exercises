package com.example.LibraryManagementSystem;
import java.util.*;

public class Book {
	private int bookId;
	private String title;
	private String author;

	public Book() {
	}
	public Book(int bookId, String title, String author)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	public int getproductId() {
		return bookId;
	}
	public String getProductName() {
		return title;
	}

	public String getCategory() {
		return author;
	}

	public Book linearSearch(Book[] books,int target) {
		for(Book b1:books) {
			if(b1.getproductId()==target) {
				return b1;
			}
		}
		return null;
	}

	public Book binarySearch(Book[] books,int target) {
		int left=0;
		int right=books.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(books[mid].getproductId()==target) {
				return books[mid];
			}
			else if(mid<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return null;
	}
}
