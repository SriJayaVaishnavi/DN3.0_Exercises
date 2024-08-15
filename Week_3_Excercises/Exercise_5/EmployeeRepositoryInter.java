package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryInter extends JpaRepository<Employee, Integer> {

    @Query(name = "Employee.findByName")
    List<Employee> findEmployeesByName(@Param("name") String name);

    @Query(name = "Employee.findByEmail")
    Employee findEmployeeByEmail(@Param("email") String email);
}
