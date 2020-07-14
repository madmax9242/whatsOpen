package com.whatsOpen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsOpen.dao.EmployeeDao;
import com.whatsOpen.model.Employee;
import com.whatsOpen.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao eDao;
	
	@Override
	public Employee createEmployee(Employee e) {
		return eDao.save(e);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return eDao.findAll();
	}

	@Override
	public Employee findEmployeenById(Integer id) {
		return eDao.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return eDao.save(e);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		eDao.deleteById(id);
		
	}

}
