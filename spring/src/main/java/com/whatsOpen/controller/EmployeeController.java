package com.whatsOpen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.whatsOpen.model.Employee;
import com.whatsOpen.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	//Create new employee
	@PostMapping("/employee/new")
	public Employee createEmployee(@RequestBody Employee emp ) {
		return es.createEmployee(emp);
	}
	
	//Find employee by Id
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable Integer id) {
		return es.findEmployeeById(id);
	}
	
	@PostMapping("/employee/email")
	public Employee findEmployeeByEmail(@RequestBody Employee emp) {
		return es.findEmployeeByEmail(emp.getEmail());
	}
	
	//Find all employees
	@GetMapping("/employee/all")
	public List<Employee> findAllEmployees() {
		return es.findAllEmployees();
	}
	
	//Update employee information
	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return es.updateEmployee(emp);
	}
	
	//Delete employee from system
	@DeleteMapping("employee/delete/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		es.deleteEmployeeById(id);
	}

}
