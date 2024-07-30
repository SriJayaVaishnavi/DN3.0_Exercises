package com.example.sort;
import java.util.*;

public class Order {
private int orderId;
private String customerName;
private double totalPrice;

public Order() {}
public Order(int orderId,String customerName,double totalPrice) {
	this.customerName=customerName;
	this.orderId=orderId;
	this.totalPrice=totalPrice;
}
public int getOrderId() {
	return orderId;
}
public String getCustomerName() {
	return customerName;
}
public double getTotalPrice() {
	return totalPrice;
}

public void bubbleSort(Order[] orders) {
	int n=orders.length;
	boolean swap;
	for(int i=0;i<n-1;i++) {
		swap=false;
		for(int j=0;j<n-1;j++) {
			if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice()) {
				Order temp=orders[j];
				orders[j]=orders[j+1];
				orders[j+1]=temp;
				swap=true;
			}
		}
		if(!swap)break;
	}
}


}
