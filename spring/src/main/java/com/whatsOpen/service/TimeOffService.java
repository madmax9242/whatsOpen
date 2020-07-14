package com.whatsOpen.service;

import java.util.List;

import com.whatsOpen.model.TimeOff;
import org.springframework.stereotype.Service;

public interface TimeOffService {

	//Post
	public TimeOff createTimeOffRequest(TimeOff off);
	
	//Get by Id
	public TimeOff getAllRequestsById(Integer id);
	
	//Get All
	public List<TimeOff> getallTimeOff();
	
	//Update request
	public TimeOff updateRequestOff(TimeOff off);
	
	//Delete request
	public void deleteTimeOffRequest(Integer id);
	
}
