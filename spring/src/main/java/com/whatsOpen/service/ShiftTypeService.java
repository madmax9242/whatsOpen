package com.whatsOpen.service;

import java.util.List;

import com.whatsOpen.model.ShiftType;

public interface ShiftTypeService {
	
	/*
	 * TODO
	 * Define the type of find methods that we need
	 * */

	public abstract ShiftType add(ShiftType shiftType);
	public abstract ShiftType update(ShiftType shiftType);
	public abstract void remove(ShiftType shiftType);
	public abstract List<ShiftType> findAll();
	
}
