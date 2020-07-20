package com.whatsOpen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@SequenceGenerator(name ="shift_seq", initialValue = 401)
@Table(name = "tb_shift")
public class Shift implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shift_seq")
	private int id;
	
	private Date date;
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeeId", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Employee employee;
//    @OnDelete(action = OnDeleteAction.CASCADE)
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shiftTypeId",nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private ShiftType shiftType;
	
	public Shift() {}

	public Shift(int id, Date date, String description, Employee employee, ShiftType shiftType) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.employee = employee;
		this.shiftType = shiftType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ShiftType getShiftType() {
		return shiftType;
	}

	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}

	@Override
	public String toString() {
		return "Shift id= " + id + 
				", date= " + date + 
				", description= " + description + 
				", employee= " + employee +
				", shiftType= " + shiftType;
	}
	
}
