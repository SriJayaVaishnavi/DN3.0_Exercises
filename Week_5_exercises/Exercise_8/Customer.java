package com.example.Entity;
import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=1,max=255)
	@Column(nullable=false)
	private String name;
	
	@NotNull
	@Email
	@Size(min=1,max=255)
	@Column(nullable=false)
	private String email;
	
	@NotNull
	@Size(min=9,max=255)
	private String password;
	
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getPassword() {
		return password;
	}
	
	
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
    public void setEmail(String email) {
    	this.email=email;
    }
    
    public void setPassword(String password) {
    	this.password=password;
    }
    
   
}
