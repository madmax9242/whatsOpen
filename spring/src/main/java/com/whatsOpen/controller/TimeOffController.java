package com.whatsOpen.controller;

import com.whatsOpen.model.TimeOff;
import com.whatsOpen.service.TimeOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TimeOffController {

	@Autowired
	TimeOffService tos;

	// CREATE
	@PostMapping("/timeOffRequest")
	public TimeOff newRequestOff(@RequestBody TimeOff off) {
		return tos.createTimeOffRequest(off);
	}

	// READ
	@GetMapping("/timeOffRequests")
	public List<TimeOff> getRequests() {
		return tos.getAllTimeOff();
	}

	// UPDATE
	@PutMapping("/timeOffRequest")
	public TimeOff updateRequestOff(@RequestBody TimeOff off) {
		return tos.updateRequestOff(off);
	}

	// DELETE
	@DeleteMapping("/timeOffRequest/delete/{id}")
	public void deleteTimeOffRequest(@PathVariable Integer id) {
		tos.deleteTimeOffRequest(id);
	}
}
