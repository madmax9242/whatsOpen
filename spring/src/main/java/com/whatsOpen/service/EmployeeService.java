package com.whatsOpen.service;

import com.whatsOpen.model.Employee;

import java.util.List;

public interface EmployeeService {

	// CREATE
	public Employee createEmployee(Employee e);

	// READ
	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(Integer id);

	public Employee findEmployeeByEmail(String email);

	// UPDATE
	public Employee updateEmployee(Employee e);

	// DELETE
	public void deleteEmployeeById(Integer id);

}
