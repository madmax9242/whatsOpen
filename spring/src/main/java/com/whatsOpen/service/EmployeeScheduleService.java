package com.whatsOpen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whatsOpen.model.EmployeeSchedule;

@Service
public interface EmployeeScheduleService {
	
	public EmployeeSchedule findEmployeeScheduleById(Integer id);
	
	public List<EmployeeSchedule> findAllEmployeeSchedules();
	
	public EmployeeSchedule postSchedule(EmployeeSchedule es);
	
	public EmployeeSchedule updateSchedule(EmployeeSchedule es);
	
	public void deleteScheduleById(Integer id);

}
