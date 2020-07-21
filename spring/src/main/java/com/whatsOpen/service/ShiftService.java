package com.whatsOpen.service;

import java.util.List;

import com.whatsOpen.model.Shift;

public interface ShiftService {
	
	/*
	 * TODO
	 * Define if we need to find a shift by ID
	 * */

	public abstract Shift add(Shift shift);
	public abstract void remove(Shift shift);
	public abstract Shift update(Shift shift);
	public abstract List<Shift> findAll();
	public abstract List<Shift> findAllByEmployee(Integer id);
	
}
