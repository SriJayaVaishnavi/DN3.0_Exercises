package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    
    @GetMapping("/search")
    public Page<Employee> getEmployeesByName(
            @RequestParam String name,
            Pageable pageable) {
        return employeeService.findEmployeesByName(name, pageable);
    }

   
    @GetMapping("/department")
    public Page<Employee> getEmployeesByDept(
            @RequestParam Department dept,
            Pageable pageable) {
        return employeeService.findEmployeesByDept(dept, pageable);
    }

    
    @GetMapping("/department/name")
    public Page<Employee> getEmployeesByDeptName(
            @RequestParam String deptName,
            Pageable pageable) {
        return employeeService.findEmployeesByDeptName(deptName, pageable);
    }
}
