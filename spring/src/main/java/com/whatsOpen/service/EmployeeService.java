package com.whatsOpen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whatsOpen.model.Employee;


public interface EmployeeService {

	//POST
	public Employee createEmployee(Employee e);
		
	//GET ALL
	public List<Employee> findAllEmployees();
		
	//GET BY ID
	public Employee findEmployeenById(Integer id);
		
	//UPDATE
	public Employee updateEmployee(Employee e);
		
	//DELETE
	public void deleteEmployeeById(Integer id);
}
