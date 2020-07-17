package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.EmployeeSchedule;

@Repository
public interface EmployeeScheduleDao extends JpaRepository<EmployeeSchedule, Integer> {

}
