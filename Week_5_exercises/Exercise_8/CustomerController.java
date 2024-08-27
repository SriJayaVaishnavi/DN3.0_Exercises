package com.example.BookstoreAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookstoreAPI.service.CustomerService;
import com.example.Entity.Customer;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

	private CustomerService customerservice;
	
	@Autowired
	public CustomerController(CustomerService bookservice) {
		this.customerservice=customerservice;
	}
   
	@GetMapping("/customers")
	public List<Customer> getAllCustomer(){
		return customerservice.getAllCustomer();
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Customer> getBookById(@PathVariable Long id){
		Optional<Customer> book=customerservice.getCustomerById(id);
		return book.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Customer> updateBook(@PathVariable Long id, @RequestBody Book book){
		Customer updatedbook = customerservice.updateBook(id, book);
		return ResponseEntity.ok(updatedbook);		
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id){
		customerservice.deleteCustomer(id);
		return ResponseEntity.ok("books deleted successfully");
	}
}
