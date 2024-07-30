package com.example.EcommersePlatformSearch;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;


public class Test {
public static void main(String args[]) {
	Product pd=new Product();
	Product[] products= {
			new Product(1,"Skirt","Clothing"),
			new Product(2,"Talcum powder","Costmetics"),
			new Product(3,"Laptop","Electronics")
	};
	Product result=pd.linearSearch(products,2);
	if(result==null) {
		System.out.println("Item not found!");
	}
	else {
		System.out.println("Item found by linear search: "+result.getProductName());
	}
	

// for binary search creating sorted array
Arrays.sort(products,Comparator.comparingInt(Product::getproductId));
Product result2=pd.binarySearch(products,1);
if(result==null) {
	System.out.println("Item not found!");
}
else {
	System.out.println("Item found by binary search: "+result2.getProductName());
}
}
}

