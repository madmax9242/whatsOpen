package com.whatsOpen.service.impl;

import com.whatsOpen.dao.ShiftTypeDAO;
import com.whatsOpen.model.ShiftType;
import com.whatsOpen.service.ShiftTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {

	@Autowired
	private ShiftTypeDAO shiftTypeDAO;

	// CREATE
	@Override
	public ShiftType add(ShiftType shiftType) {
		ShiftType rShiftType = null;
		if (shiftType != null) {
			rShiftType = shiftTypeDAO.save(shiftType);
		}
		return rShiftType;
	}

	// READ
	@Override
	public List<ShiftType> findAll() {
		return shiftTypeDAO.findAll();
	}

	// UPDATE
	@Override
	public ShiftType update(ShiftType shiftType) {
		ShiftType rShiftType = null;
		if (shiftType != null) {
			rShiftType = shiftTypeDAO.save(shiftType);
		}
		return rShiftType;
	}

	// DELETE
	@Override
	public void remove(ShiftType shiftType) {
		// TODO Auto-generated method stub

	}
}
