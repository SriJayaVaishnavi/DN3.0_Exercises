package com.example.EmployeeManagementSystem;
import java.util.*;

public class Employee {
private int employeeId;
private String name;
private String position;
private double salary;
private int size;


private Employee[] employees;

public Employee() {
	this.employees=new Employee[50];
	this.size=0;
	
}
public Employee(int employeeId, String name,String position, double salary) {
	this.employeeId=employeeId;
	this.name=name;
	this.position=position;
	this.salary=salary;
	
}
public int getEmployeeId() {
	return employeeId;
}

public String getName() {
	return name;
}

public String getPosition() {
	return position;
}

public double getSalary() {
	return salary;
}

public void addEmployee(Employee employee) {
	if(size==employees.length) {
		System.out.println("Already full cant add employees");
		return;
	}
	employees[size++]=employee;
}

public Employee searchEmployee(int employeeId) {
	for(int i=0;i<size;i++) {
		if(employees[i].getEmployeeId()==employeeId) {
			return employees[i];
		}
	}
	return null;
}

public void traverse() {
	for(int i=0;i<size;i++) {
		System.out.println(employees[i].getName());
	}
}
public void deleteEmployee(int employeeId) {
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (employees[i].getEmployeeId() == employeeId) {
            index = i;
            break;
        }
    }
    if (index == -1) {
        System.out.println("Employee not found.");
        return;
    }
    for (int i = index; i < size - 1; i++) {
        employees[i] = employees[i + 1];
    }
    employees[--size] = null; 
}


}
