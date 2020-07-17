package com.whatsOpen.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "employee_schedule_seq", initialValue = 301)
@Table( name = "tb_employee_schedule")
public class EmployeeSchedule{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_schedule_seq")
	private Integer id;
	
	private boolean mondayDay;
	private boolean mondayNight;
	private boolean tuesdayDay;
	private boolean tuesdayNight;
	private boolean wednesdayDay;
	private boolean wednesdayNight;
	private boolean thursdayDay;
	private boolean thursdayNight;
	private boolean fridayDay;
	private boolean fridayNight;
	private boolean saturdayDay;
	private boolean saturdayNight;
	private boolean sundayDay;
	private boolean sundayNight;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;
	
	public EmployeeSchedule() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isMondayDay() {
		return mondayDay;
	}

	public void setMondayDay(boolean mondayDay) {
		this.mondayDay = mondayDay;
	}

	public boolean isMondayNight() {
		return mondayNight;
	}

	public void setMondayNight(boolean mondayNight) {
		this.mondayNight = mondayNight;
	}

	public boolean isTuesdayDay() {
		return tuesdayDay;
	}

	public void setTuesdayDay(boolean tuesdayDay) {
		this.tuesdayDay = tuesdayDay;
	}

	public boolean isTuesdayNight() {
		return tuesdayNight;
	}

	public void setTuesdayNight(boolean tuesdayNight) {
		this.tuesdayNight = tuesdayNight;
	}

	public boolean isWednesdayDay() {
		return wednesdayDay;
	}

	public void setWednesdayDay(boolean wednesdayDay) {
		this.wednesdayDay = wednesdayDay;
	}

	public boolean isWednesdayNight() {
		return wednesdayNight;
	}

	public void setWednesdayNight(boolean wednesdayNight) {
		this.wednesdayNight = wednesdayNight;
	}

	public boolean isThursdayDay() {
		return thursdayDay;
	}

	public void setThursdayDay(boolean thursdayDay) {
		this.thursdayDay = thursdayDay;
	}

	public boolean isThursdayNight() {
		return thursdayNight;
	}

	public void setThursdayNight(boolean thursdayNight) {
		this.thursdayNight = thursdayNight;
	}

	public boolean isFridayDay() {
		return fridayDay;
	}

	public void setFridayDay(boolean fridayDay) {
		this.fridayDay = fridayDay;
	}

	public boolean isFridayNight() {
		return fridayNight;
	}

	public void setFridayNight(boolean fridayNight) {
		this.fridayNight = fridayNight;
	}

	public boolean isSaturdayDay() {
		return saturdayDay;
	}

	public void setSaturdayDay(boolean saturdayDay) {
		this.saturdayDay = saturdayDay;
	}

	public boolean isSaturdayNight() {
		return saturdayNight;
	}

	public void setSaturdayNight(boolean saturdayNight) {
		this.saturdayNight = saturdayNight;
	}

	public boolean isSundayDay() {
		return sundayDay;
	}

	public void setSundayDay(boolean sundayDay) {
		this.sundayDay = sundayDay;
	}

	public boolean isSundayNight() {
		return sundayNight;
	}

	public void setSundayNight(boolean sundayNight) {
		this.sundayNight = sundayNight;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
