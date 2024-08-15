package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Integer> {

    
    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> findEmployeesByName(@Param("name") String name);

    
    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findEmployeeByMail(@Param("email") String email);

    
    @Query("SELECT e FROM Employee e WHERE e.department = :department")
    List<Employee> findEmployeesByDept(@Param("department") Department department);

    
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDeptName(@Param("departmentName") String departmentName);
}
