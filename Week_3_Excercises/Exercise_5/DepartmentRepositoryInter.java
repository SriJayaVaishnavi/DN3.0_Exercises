package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryInter extends JpaRepository<Department, Integer> {

    @Query(name = "Department.findByName")
    Department findDepartmentByName(@Param("name") String name);
}
