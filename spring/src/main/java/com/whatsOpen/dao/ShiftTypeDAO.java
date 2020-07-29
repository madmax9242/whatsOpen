package com.whatsOpen.dao;

import com.whatsOpen.model.ShiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftTypeDAO extends JpaRepository<ShiftType, Integer> {

}
