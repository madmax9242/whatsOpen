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

import com.whatsOpen.model.EmployeeSchedule;
import com.whatsOpen.service.EmployeeScheduleService;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class EmployeeScheduleController {
	
	@Autowired
	EmployeeScheduleService ess;
	
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
	
	@PostMapping("/schedule")
	public EmployeeSchedule createNewSchedule(@RequestBody EmployeeSchedule es) {
		return ess.postSchedule(es);
		
	}
	
	@PutMapping("/schedule")
	public EmployeeSchedule updateSchedule(@RequestBody EmployeeSchedule es) {
		return ess.updateSchedule(es);
	}
	
	@DeleteMapping("schedule/delete/{id}")
	public void deleteSchedule(@PathVariable Integer id) {
		ess.deleteScheduleById(id);
	}
	

}
