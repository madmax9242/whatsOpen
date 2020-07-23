package com.whatsOpen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.whatsOpen.model.EmployeeSchedule;
import com.whatsOpen.service.EmployeeScheduleService;

@RestController
public class EmployeeScheduleController {
	
	@Autowired
	EmployeeScheduleService ess;
	
	@GetMapping("/schedule/all")
	public List<EmployeeSchedule> getAllSchedules() {
		return ess.findAllEmployeeSchedules();
	}
	
//	@GetMapping("/schedule/{employee_id}")
//	public EmployeeSchedule getMySchedule(@PathVariable Integer employee_id) {
//		return ess.findEmployeeScheduleById(employee_id);
//	}
	
	@PostMapping("/schedule/new")
	public EmployeeSchedule createNewSchedule(@RequestBody EmployeeSchedule es) {
		return ess.postSchedule(es);
		
	}
	
	@PutMapping("/schedule")
	public EmployeeSchedule updateSchedule(@RequestBody EmployeeSchedule es) {
		return ess.updateSchedule(es);
	}
	
	@DeleteMapping("schedule/delete")
	public void deleteSchedule(@PathVariable Integer id) {
		ess.deleteScheduleById(id);
	}
	

}
