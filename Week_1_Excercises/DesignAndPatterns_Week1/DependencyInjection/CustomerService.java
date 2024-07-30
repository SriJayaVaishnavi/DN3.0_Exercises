package com.example.DependencyInjectionExample;

public class CustomerService {
private CustomerRepository cust;

public CustomerService(CustomerRepository cust) {
	this.cust=cust;
}

public void print(String id) {
	String custt=cust.findCustomerById(id);
	System.out.println("Customer Details: "+custt);
}
}
