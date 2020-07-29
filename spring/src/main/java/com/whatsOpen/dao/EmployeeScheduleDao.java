package com.whatsOpen.dao;

import com.whatsOpen.model.EmployeeSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeScheduleDao extends JpaRepository<EmployeeSchedule, Integer> {

	EmployeeSchedule findByEmployeeId(Integer id);

}
