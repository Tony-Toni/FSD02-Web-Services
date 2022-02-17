package com.example.restservice.api;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
	EmployeeService empService = new EmployeeService();

	@GetMapping("/emp")
	public List<Employee> getAllEmps() {
		return empService.getAllEmps();
	}

	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable int id){
		return empService.getById(id);
	}

	@PostMapping("/emp")
	public Employee saveEmp(@RequestBody Employee emp){
		empService.addEmployee(emp);
		return emp;
	}
}
