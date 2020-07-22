package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	public Employee findByEmail(String email);

}
