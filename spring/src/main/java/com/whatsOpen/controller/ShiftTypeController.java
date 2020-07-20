package com.whatsOpen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsOpen.model.ShiftType;
import com.whatsOpen.service.impl.ShiftTypeServiceImpl;

@RestController
@RequestMapping(value="/api")
public class ShiftTypeController {

	@Autowired
	private ShiftTypeServiceImpl shiftTypeSrvcImpl;
	
	@GetMapping("/shift/types")
	public List<ShiftType> getAll(){
		return shiftTypeSrvcImpl.findAll();
	}
	
	@PostMapping("/shift/type")
	public ShiftType addShift(@RequestBody ShiftType shiftType){
		return shiftTypeSrvcImpl.add(shiftType);
	}
	
}
