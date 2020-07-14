package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whatsOpen.model.EmployeeSchedule;

public interface EmployeeScheduleDao extends JpaRepository<EmployeeSchedule, Integer> {

}
