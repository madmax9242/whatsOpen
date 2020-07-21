package com.whatsOpen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsOpen.model.Shift;
import com.whatsOpen.service.impl.ShiftServiceImpl;

@RestController
@RequestMapping("/api")
public class ShiftController {
	
	@Autowired
	private ShiftServiceImpl shiftSrvcImpl;
	
	@GetMapping("/shifts")
	public List<Shift> getAll(){
		return shiftSrvcImpl.findAll();
	}
	
	@PostMapping("/shift")
	public Shift add(@RequestBody Shift shift) {
		return shiftSrvcImpl.add(shift);
	}
	
	@GetMapping("/shifts/{emp_id}")
	public List<Shift> getAllByEmployeeId(@PathVariable int emp_id) {
		return shiftSrvcImpl.findAllByEmployee(emp_id);
	}

}
