package com.example.EmployeeManagementSystem;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee createEmp(@RequestBody Employee employee) {
    	return employeeRepository.save(employee);
    }
    
    @GetMapping
    public List<Employee> getAllEmployees(){
    	return employeeRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id,@RequestBody Employee employeeDetails){
    	Optional<Employee> optionalEmployee= employeeRepository.searchById(id);
    	if(optionalEmployee.isPresent()) {
    		return ResponseEntity.ok(optionalEmployee.get());
    	}
    	else {
    		return ResponseEntity.notFound().build();    	}
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id,@RequestBody Employee employeeDetails){
    	Optional<Employee> optionalEmployee = employeeRepository.findById(id);
    	if(optionalEmployee.isPresent()) {
    		Employee employee = optionalEmployee.get();
    		employee.setName(employeeDetails.getName());
    		employee.setEmail(employeeDetails.getName());
    		employee.setEmail(employeeDetails.getEmail());
    		employee.setDepartment(employeeDetails.getDepartment());
    		return ResponseEntity.ok(employeeRepository.save(employee));
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
    }
    @DeleteMapping("/{id")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id ){
    	if(employeeRepository.existsById(id)){
    		employeeRepository.deleteById(id);
    		return ResponseEntity.noContent().build();
    	}
    	else {
    		return ResponseEntity.notFound().build();
    	}
    }
}
