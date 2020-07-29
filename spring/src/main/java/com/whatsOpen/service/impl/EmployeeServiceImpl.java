package com.whatsOpen.service.impl;

import com.whatsOpen.dao.EmployeeDao;
import com.whatsOpen.model.Employee;
import com.whatsOpen.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao eDao;

	// CREATE
	@Override
	public Employee createEmployee(Employee e) {
		return eDao.save(e);
	}

	// READ
	@Override
	public List<Employee> findAllEmployees() {
		return eDao.findAll();
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return eDao.findById(id).get();
	}

	@Override
	public Employee findEmployeeByEmail(String email) {
		return eDao.findByEmail(email);
	}

	// UPDATE
	@Override
	public Employee updateEmployee(Employee e) {
		return eDao.save(e);
	}

	// DELETE
	@Override
	public void deleteEmployeeById(Integer id) {
		eDao.deleteById(id);

	}
}
