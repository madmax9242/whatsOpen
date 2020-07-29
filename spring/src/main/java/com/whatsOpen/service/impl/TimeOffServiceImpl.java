package com.whatsOpen.service.impl;

import com.whatsOpen.dao.TimeOffDao;
import com.whatsOpen.model.TimeOff;
import com.whatsOpen.service.TimeOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeOffServiceImpl implements TimeOffService {

	@Autowired
	TimeOffDao timeOffDao;

	// CREATE
	@Override
	public TimeOff createTimeOffRequest(TimeOff off) {
		return timeOffDao.save(off);
	}

	// READ
	@Override
	public List<TimeOff> getAllTimeOff() {
		return timeOffDao.findAll();
	}

	@Override
	public TimeOff getAllRequestsById(Integer id) {
		return timeOffDao.findById(id).get();
	}

	@Override
	public TimeOff getRequestByEmployeeId(Integer id) {
		return timeOffDao.findByEmployeeId(id);
	}

	// UPDATE
	@Override
	public TimeOff updateRequestOff(TimeOff off) {
		return timeOffDao.save(off);
	}

	// DELETE
	@Override
	public void deleteTimeOffRequest(Integer id) {
		timeOffDao.deleteById(id);

	}
}
