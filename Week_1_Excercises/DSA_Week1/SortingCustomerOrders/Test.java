package com.example.sort;
import java.util.*;

public class Test {
	 public static void main(String[] args) {
	        Order[] orders = {
	            new Order(1, "Alice", 250.5),
	            new Order(2, "Bob", 150.0),
	            new Order(3, "Charlie", 350.0)
	        };

	        quickSort q=new quickSort();
	        quickSort.quickSort(orders, 0, orders.length - 1);

	        System.out.println("Sorted orders by totalPrice:");
	        for (Order order : orders) {
	            System.out.println(order.getTotalPrice());
	        }
	        Order[] orders2 = {
		            new Order(1, "Alice", 250.5),
		            new Order(2, "Bob", 150.0),
		            new Order(3, "Charlie", 350.0)
		        };
	       Order o1=new Order();
	       o1.bubbleSort(orders2);
	       System.out.println("Sorted orders by totalPrice:");
	        for (Order order : orders) {
	            System.out.println(order.getTotalPrice());
	        }
	    }
}
