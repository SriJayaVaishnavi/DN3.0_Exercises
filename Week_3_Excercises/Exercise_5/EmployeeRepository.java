package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    
    List<Employee> findByName(String name);

   
    Employee findByMail(String email);

   
    List<Employee> findByDept(Department department);

   
    List<Employee> findByDept_Name(String departmentName);
}
