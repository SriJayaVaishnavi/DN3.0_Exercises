package com.example.DependencyInjectionExample;

public class Test {
public static void main(String args[]) {
	CustomerRepository cust=new CustomerRepositoryImpl();
	CustomerService custt=new CustomerService(cust);
	
	custt.print("124");
	custt.print("903");
}
}
