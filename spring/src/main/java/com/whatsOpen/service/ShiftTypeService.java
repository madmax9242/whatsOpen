package com.whatsOpen.service;

import com.whatsOpen.model.ShiftType;

import java.util.List;

public interface ShiftTypeService {

	/*
	 * TODO
	 * Define the type of find methods that we need
	 * */

	// CREATE
	public abstract ShiftType add(ShiftType shiftType);

	// READ
	public abstract List<ShiftType> findAll();

	// UPDATE
	public abstract ShiftType update(ShiftType shiftType);

	// DELETE
	public abstract void remove(ShiftType shiftType);

}
