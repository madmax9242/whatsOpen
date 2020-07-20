package com.whatsOpen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.Shift;

@Repository
public interface ShiftDAO extends JpaRepository<Shift, Integer>{

	public abstract List<Shift> findByEmployeeId(int id);
	
}
