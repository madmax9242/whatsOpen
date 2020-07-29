package com.whatsOpen.controller;

import com.whatsOpen.model.EmployeeSchedule;
import com.whatsOpen.service.EmployeeScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeScheduleController {

	@Autowired
	EmployeeScheduleService ess;

	// CREATE
	@PostMapping("/schedule")
	public EmployeeSchedule createNewSchedule(@RequestBody EmployeeSchedule es) {
		return ess.postSchedule(es);
	}

	// READ
	@GetMapping("/schedules")
	public List<EmployeeSchedule> getAllSchedules() {
		return ess.findAllSchedules();
	}

	@GetMapping("/schedule/{id}")
	public EmployeeSchedule getScheduleById(@PathVariable Integer id) {
		return ess.findScheduleById(id);
	}

	@GetMapping("/schedule/employee/{employee_id}")
	public EmployeeSchedule getScheduleByEmployeeId(@PathVariable Integer employee_id) {
		return ess.findScheduleById(employee_id);
	}

	// UPDATE
	@PutMapping("/schedule")
	public EmployeeSchedule updateSchedule(@RequestBody EmployeeSchedule es) {
		return ess.updateSchedule(es);
	}

	// DELETE
	@DeleteMapping("/schedule/delete/{id}")
	public void deleteSchedule(@PathVariable Integer id) {
		ess.deleteScheduleById(id);
	}
}
