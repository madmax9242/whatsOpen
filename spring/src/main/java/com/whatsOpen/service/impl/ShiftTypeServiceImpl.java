package com.whatsOpen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whatsOpen.dao.ShiftTypeDAO;
import com.whatsOpen.model.ShiftType;
import com.whatsOpen.service.ShiftTypeService;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {

	@Autowired
	private ShiftTypeDAO shiftTypeDAO;
	
	@Override
	public ShiftType add(ShiftType shiftType) {
		ShiftType rShiftType = null;
		if (shiftType != null) {
			rShiftType = shiftTypeDAO.save(shiftType);
		}
		return rShiftType;
	}

	@Override
	public ShiftType update(ShiftType shiftType) {
		ShiftType rShiftType = null;
		if (shiftType != null) {
			rShiftType = shiftTypeDAO.save(shiftType);
		}
		return rShiftType;
	}

	@Override
	public void remove(ShiftType shiftType) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ShiftType> findAll() {
		return shiftTypeDAO.findAll();
	}

}
