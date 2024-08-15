package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> findEmployeesByName(String name, Pageable pageable) {
        return employeeRepository.findEmployeesByName(name, pageable);
    }

    public Page<Employee> findEmployeesByDept(Department department, Pageable pageable) {
        return employeeRepository.findEmployeesByDept(department, pageable);
    }

    public Page<Employee> findEmployeesByDeptName(String departmentName, Pageable pageable) {
        return employeeRepository.findEmployeesByDeptName(departmentName, pageable);
    }
}
