package com.example.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public String findCustomerById(String id) {
		if(id.equals("124")) {
			return "Bill";
		}
		return "Customer not available";
	}
	

}
