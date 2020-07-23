package com.whatsOpen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whatsOpen.model.EmployeeSchedule;

@Service
public interface EmployeeScheduleService {
	
	public EmployeeSchedule findScheduleById(Integer id);
	
	public EmployeeSchedule findScheduleByEmployeeId(Integer id);
	
	public List<EmployeeSchedule> findAllSchedules();
	
	public EmployeeSchedule postSchedule(EmployeeSchedule es);
	
	public EmployeeSchedule updateSchedule(EmployeeSchedule es);
	
	public void deleteScheduleById(Integer id);

}
