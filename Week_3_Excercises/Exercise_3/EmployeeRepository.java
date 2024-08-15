package com.example.EmployeeManagementSystem;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	List<Employee> searchByName(String name);
	Employee searchByEmail(String mail);
	List<Employee> searchByDepartment(Department department);
	
}
