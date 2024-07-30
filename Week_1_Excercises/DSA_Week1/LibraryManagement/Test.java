package com.example.LibraryManagementSystem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;


public class Test {
public static void main(String args[]) {
	Book pd=new Book();
	Book[] books= {
			new Book(1,"HarryPotter","JK Rowling"),
			new Book(2,"Game of thrones","xxx"),
			new Book(3,"Noght circus","yyy")
	};
	Book result=pd.linearSearch(books,2);
	if(result==null) {
		System.out.println("Item not found!");
	}
	else {
		System.out.println("Item found by linear search: "+result.getProductName());
	}
	

// for binary search creating sorted array
Arrays.sort(books,Comparator.comparingInt(Book::getproductId));
Book result2=pd.binarySearch(books,1);
if(result==null) {
	System.out.println("Item not found!");
}
else {
	System.out.println("Item found by binary search: "+result2.getProductName());
}
}
}

