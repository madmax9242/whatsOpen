package com.whatsOpen.controller;

import com.whatsOpen.model.Shift;
import com.whatsOpen.service.impl.ShiftServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ShiftController {

	@Autowired
	private ShiftServiceImpl shiftSrvcImpl;

	// CREATE
	@PostMapping("/shift")
	public Shift add(@RequestBody Shift shift) {
		return shiftSrvcImpl.add(shift);
	}

	// READ
	@GetMapping("/shifts")
	public List<Shift> getAll() {
		return shiftSrvcImpl.findAll();
	}

	@GetMapping("/shifts/{emp_id}")
	public List<Shift> getAllByEmployeeId(@PathVariable int emp_id) {
		return shiftSrvcImpl.findAllByEmployee(emp_id);
	}
}
