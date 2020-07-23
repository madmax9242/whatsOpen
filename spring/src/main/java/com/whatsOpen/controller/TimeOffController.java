package com.whatsOpen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsOpen.model.TimeOff;
import com.whatsOpen.service.TimeOffService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TimeOffController {
	
	@Autowired
	TimeOffService tos;
	
	@GetMapping("/timeOffRequests")
	public List<TimeOff> getRequests() {
		return tos.getallTimeOff();
	}
	
	@PostMapping("/timeOffRequest")
	public TimeOff newRequestOff(@RequestBody TimeOff off) {
		return tos.createTimeOffRequest(off);
	}
	
	@PutMapping("/timeOffRequest")
	public TimeOff updateRequestOff(@RequestBody TimeOff off) {
		return tos.updateRequestOff(off);
	}
	
	@DeleteMapping("/timeOffRequest/delete/{id}")
	public void deleteTimeOffRequest(@PathVariable Integer id) {
		tos.deleteTimeOffRequest(id);
	}

}
