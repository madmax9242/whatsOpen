package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.TimeOff;

@Repository
public interface TimeOffDao extends JpaRepository<TimeOff, Integer>  {
	public TimeOff findByEmployeeId(Integer id);

}
