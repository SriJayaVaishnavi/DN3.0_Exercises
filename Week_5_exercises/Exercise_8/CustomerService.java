package com.example.BookstoreAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookstoreAPI.repository.CustomerRepository;
import com.example.Entity.Book;
import com.example.Entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
 private CustomerRepository customerrepository = null;
 
 @Autowired
 public CustomerService(CustomerRepository customerrepository) {
	 this.customerrepository=customerrepository;
 }
 
 public List<Customer> getAllCustomer(){
	 return customerrepository.findAll();
 }
 
 public Optional<Customer> getCustomerById(Long id){
	 return customerrepository.findById(id);
 }
 
 @Transactional
 public Book addBook(Customer customer) {
	 return customerrepository.save(customer);
 }
 
 @Transactional
 public Book updateCustomer(Long id,Customer customer) {
	 if(customerrepository.existsById(id)) {
		 customer.setId(id);
		 return customerrepository.save(customer);
	 }
	 return null;
 }
 
 @Transactional
 public void deleteCustomer(Long id) {
	 customerrepository.deleteById(id);
 }
}
