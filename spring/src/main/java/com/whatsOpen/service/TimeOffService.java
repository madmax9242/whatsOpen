package com.whatsOpen.service;

import com.whatsOpen.model.TimeOff;

import java.util.List;

public interface TimeOffService {

	// CREATE
	public TimeOff createTimeOffRequest(TimeOff off);

	// READ
	public List<TimeOff> getAllTimeOff();

	public TimeOff getAllRequestsById(Integer id);

	public TimeOff getRequestByEmployeeId(Integer id);

	// UPDATE
	public TimeOff updateRequestOff(TimeOff off);

	// DELETE
	public void deleteTimeOffRequest(Integer id);

}
