package com.whatsOpen.service;

import com.whatsOpen.model.Shift;

import java.util.List;

public interface ShiftService {

	/*
	 * TODO
	 * Define if we need to find a shift by ID
	 * */

	// CREATE
	public abstract Shift add(Shift shift);

	// READ
	public abstract List<Shift> findAll();

	public abstract List<Shift> findAllByEmployee(Integer id);

	// UPDATE
	public abstract Shift update(Shift shift);

	// DELETE
	public abstract void remove(Shift shift);

}
