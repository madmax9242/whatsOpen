package com.whatsOpen.dao;

import com.whatsOpen.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShiftDAO extends JpaRepository<Shift, Integer> {

	List<Shift> findByEmployeeId(Integer id);

}
