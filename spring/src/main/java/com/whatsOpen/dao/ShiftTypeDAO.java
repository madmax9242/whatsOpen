package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.ShiftType;

@Repository
public interface ShiftTypeDAO extends JpaRepository<ShiftType, Integer>{

}
