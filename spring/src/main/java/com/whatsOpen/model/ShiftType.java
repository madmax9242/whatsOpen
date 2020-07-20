package com.whatsOpen.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="shift_type_seq", initialValue=501)
@Table(name = "tb_shift_type")
public class ShiftType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shift_type_seq")
	private int id;
	
	private String name;
	
	public ShiftType() {}

	public ShiftType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ShiftType id=" + id + 
				", name=" + name;
	}
	
}
