package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    
    @Query("SELECT * FROM Employee emp WHERE emp.name = :name")
    Page<Employee> findEmployeesByName(@Param("name") String name, Pageable pageable);

    
    @Query("SELECT * FROM Employee emp WHERE emp.email = :email")
    Employee findEmployeeByMail(@Param("email") String email);

    
    @Query("SELECT * FROM Employee emp WHERE emp.department = :department")
    Page<Employee> findEmployeesByDept(@Param("department") Department department, Pageable pageable);

    @Query("SELECT * FROM Employee emp WHERE emp.department.name = :departmentName")
    Page<Employee> findEmployeesByDeptName(@Param("departmentName") String departmentName, Pageable pageable);
}
