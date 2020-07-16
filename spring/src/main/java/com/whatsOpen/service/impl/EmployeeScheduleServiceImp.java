package com.whatsOpen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsOpen.dao.EmployeeScheduleDao;
import com.whatsOpen.model.EmployeeSchedule;
import com.whatsOpen.service.EmployeeScheduleService;

@Service
public class EmployeeScheduleServiceImp implements EmployeeScheduleService {
	
	@Autowired
	private EmployeeScheduleDao esd;

	@Override
	public EmployeeSchedule findEmployeeScheduleById(Integer id) {
		return esd.findById(id).get();
	}

	@Override
	public List<EmployeeSchedule> findAllEmployeeSchedules() {
		return esd.findAll();
	}

	@Override
	public EmployeeSchedule postSchedule(EmployeeSchedule es) {
		return esd.save(es);
	}

	@Override
	public EmployeeSchedule updateSchedule(EmployeeSchedule es) {
		return esd.save(es);
	}

	@Override
	public void deleteScheduleById(Integer id) {
		esd.deleteById(id);
	}

}
