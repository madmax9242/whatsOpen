package com.whatsOpen.service.impl;

import com.whatsOpen.dao.EmployeeScheduleDao;
import com.whatsOpen.model.EmployeeSchedule;
import com.whatsOpen.service.EmployeeScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeScheduleServiceImp implements EmployeeScheduleService {

	@Autowired
	private EmployeeScheduleDao esd;

	// CREATE
	@Override
	public EmployeeSchedule postSchedule(EmployeeSchedule es) {
		return esd.save(es);
	}

	// READ
	@Override
	public List<EmployeeSchedule> findAllSchedules() {
		return esd.findAll();
	}

	@Override
	public EmployeeSchedule findScheduleById(Integer id) {
		return esd.findById(id).get();
	}

	@Override
	public EmployeeSchedule findScheduleByEmployeeId(Integer id) {
		return esd.findByEmployeeId(id);
	}

	// UPDATE
	@Override
	public EmployeeSchedule updateSchedule(EmployeeSchedule es) {
		return esd.save(es);
	}

	// DELETE
	@Override
	public void deleteScheduleById(Integer id) {
		esd.deleteById(id);
	}
}
