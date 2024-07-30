package com.example.EcommersePlatformSearch;
import java.util.*;

public class Product {
private int productId;
private String productName;
private String category;

public Product() {
}
public Product(int productId, String productName, String category)
{
	this.productId=productId;
	this.productName=productName;
	this.category=category;
}
public int getproductId() {
	return productId;
}
public String getProductName() {
	return productName;
}

public String getCategory() {
	return category;
}

public Product linearSearch(Product[] products,int target) {
	for(Product product: products) {
		if(product.getproductId()==target) {
			return product;
		}
	}
	return null;
}

public Product binarySearch(Product[] products,int target) {
	int left=0;
	int right=products.length-1;
	while(left<=right) {
		int mid=(left+right)/2;
		if(products[mid].getproductId()==target) {
			return products[mid];
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
