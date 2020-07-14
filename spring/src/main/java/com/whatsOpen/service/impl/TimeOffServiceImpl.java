package com.whatsOpen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsOpen.dao.TimeOffDao;
import com.whatsOpen.model.TimeOff;
import com.whatsOpen.service.TimeOffService;

@Service
public class TimeOffServiceImpl implements TimeOffService {

	@Autowired
	TimeOffDao timeOffDao;
	
	@Override
	public TimeOff createTimeOffRequest(TimeOff off) {
		return timeOffDao.save(off);
	}

	@Override
	public TimeOff getAllRequestsById(Integer id) {
		return timeOffDao.findById(id).get();
	}

	@Override
	public List<TimeOff> getallTimeOff() {
		return timeOffDao.findAll();
	}

	@Override
	public TimeOff updateRequestOff(TimeOff off) {
		return timeOffDao.save(off);
	}

	@Override
	public void deleteTimeOffRequest(Integer id) {
		timeOffDao.deleteById(id);
		
	}
	
	

}
