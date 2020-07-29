package com.whatsOpen.service;

import com.whatsOpen.model.EmployeeSchedule;

import java.util.List;

public interface EmployeeScheduleService {

	// CREATE
	public EmployeeSchedule postSchedule(EmployeeSchedule es);

	// READ
	public List<EmployeeSchedule> findAllSchedules();

	public EmployeeSchedule findScheduleById(Integer id);

	public EmployeeSchedule findScheduleByEmployeeId(Integer id);

	// UPDATE
	public EmployeeSchedule updateSchedule(EmployeeSchedule es);

	// DELETE
	public void deleteScheduleById(Integer id);

}
