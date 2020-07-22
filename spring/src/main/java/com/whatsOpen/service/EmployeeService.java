package com.whatsOpen.service;

import java.util.List;

import com.whatsOpen.model.Employee;


public interface EmployeeService {

	//POST
	public Employee createEmployee(Employee e);
		
	//GET ALL
	public List<Employee> findAllEmployees();
		
	//GET BY ID
	public Employee findEmployeeById(Integer id);
	
	//GET BY EMAIL
	public Employee findEmployeeByEmail(String email);
		
	//UPDATE
	public Employee updateEmployee(Employee e);
		
	//DELETE
	public void deleteEmployeeById(Integer id);
}
