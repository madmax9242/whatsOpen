package com.whatsOpen.service.impl;

import com.whatsOpen.dao.ShiftDAO;
import com.whatsOpen.model.Shift;
import com.whatsOpen.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShiftServiceImpl implements ShiftService {

	@Autowired
	private ShiftDAO shiftDAO;

	// CREATE
	@Override
	public Shift add(Shift shift) {
		Shift rShift = null;
		if (shift != null)
			rShift = shiftDAO.save(shift);
		return rShift;
	}

	// READ
	@Override
	public List<Shift> findAll() {
		return shiftDAO.findAll();
	}

	@Override
	public List<Shift> findAllByEmployee(Integer id) {
		List<Shift> rShift = new ArrayList<Shift>();
		if (id > 0)
			rShift = shiftDAO.findByEmployeeId(id);
		return rShift;
	}

	// DELETE
	@Override
	public void remove(Shift shift) {
		// TODO Auto-generated method stub

	}

	// UPDATE
	@Override
	public Shift update(Shift shift) {
		Shift rShift = null;
		if (shift != null)
			rShift = shiftDAO.save(shift);
		return rShift;
	}
}
