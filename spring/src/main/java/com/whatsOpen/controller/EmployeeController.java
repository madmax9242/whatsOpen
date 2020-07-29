package com.whatsOpen.controller;

import com.whatsOpen.model.Employee;
import com.whatsOpen.model.Shift;
import com.whatsOpen.service.EmployeeService;
import com.whatsOpen.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

//import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService es;
	@Autowired
	ShiftService ss;

	// Sample Data
	@GetMapping("/data")
	public void createSampleData() {
		Date date = new Date(1595957486723L);
		es.createEmployee(new Employee(101, "Han", "Solo", "han@email.com", "falcon"));
		es.createEmployee(new Employee(102, "Luke", "Skywalker", "luke@email.com", "redFive"));
		es.createEmployee(new Employee(103, "Biggs", "Darklighter", "biggs@email.com", "redThree"));
		es.createEmployee(new Employee(104, "Wedge", "Antilles", "wedge@email.com", "redLeader"));
		es.createEmployee(new Employee(105, "Ewok", "SpaceBear", "ewok@email.com", "c3PO"));

		ss.add(new Shift(401, "2020-08-07T10:00:00.000Z", "Night Shift", 101));
		ss.add(new Shift(402, "2020-08-01T10:00:00.000Z", "Day Shift", 101));
		ss.add(new Shift(403, "2020-08-02T10:00:00.000Z", "Day Shift", 101));
		ss.add(new Shift(404, "2020-08-03T10:00:00.000Z", "Day Shift", 101));
		ss.add(new Shift(405, "2020-08-04T10:00:00.000Z", "Day Shift", 101));
		ss.add(new Shift(406, "2020-08-02T10:00:00.000Z", "Night Shift", 105));
		ss.add(new Shift(407, "2020-08-03T10:00:00.000Z", "Night Shift", 105));
		ss.add(new Shift(408, "2020-08-04T10:00:00.000Z", "Night Shift", 105));
		ss.add(new Shift(409, "2020-08-01T10:00:00.000Z", "Day Shift", 102));
		ss.add(new Shift(410, "2020-08-02T10:00:00.000Z", "Day Shift", 102));
		ss.add(new Shift(411, "2020-08-02T10:00:00.000Z", "Night Shift", 102));
		ss.add(new Shift(412, "2020-08-03T10:00:00.000Z", "Night Shift", 102));
		ss.add(new Shift(413, "2020-08-04T10:00:00.000Z", "Night Shift", 102));
	}

	// CREATE
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee emp) {
		return es.createEmployee(emp);
	}

	// Used a post to keep email of employee protected inside the employee object
	@PostMapping("/employee/email")
	public Employee findEmployeeByEmail(@RequestBody Employee emp) {
		return es.findEmployeeByEmail(emp.getEmail());
	}

	// READ
	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		return es.findAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable Integer id) {
		return es.findEmployeeById(id);
	}

	// UPDATE
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return es.updateEmployee(emp);
	}

	// DELETE
	@DeleteMapping("/employee/delete/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		es.deleteEmployeeById(id);
	}
}
