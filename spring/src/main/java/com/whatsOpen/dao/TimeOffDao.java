package com.whatsOpen.dao;

import com.whatsOpen.model.TimeOff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeOffDao extends JpaRepository<TimeOff, Integer> {

	TimeOff findByEmployeeId(Integer id);

}
