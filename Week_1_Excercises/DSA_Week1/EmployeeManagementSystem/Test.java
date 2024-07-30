package com.example.EmployeeManagementSystem;
import java.util.*;

public class Test {
public static void main(String args[]) {
	Employee e=new Employee();
	e.addEmployee(new Employee(1,"Vaishu","Developer",800000));
    e.addEmployee(new Employee(2,"Vimal","Developer",90000));
    e.addEmployee(new Employee(2,"Jason","Developer",90000));
    
    System.out.println("Employee list");
    e.traverse();
    
    System.out.println("Searching employee with employeeid 2");
    Employee r=e.searchEmployee(2);
    if(e!=null) 
    System.out.println("Employee found: \n"+r.getName());
    else
	System.out.println("Employee not found!");
    
    System.out.println("Deleting employee with id 2");
    e.deleteEmployee(2);
    e.traverse();

}
}
