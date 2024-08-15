package com.example.EmployeeManagementSystem;

import java.util.List;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;

@OneToMany(mappedBy = "department", cascade=CascadeType.ALL)
private List<Employee> employees;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setEmployees(List<Employee> employees) {
	this.employees=employees;
}
}
