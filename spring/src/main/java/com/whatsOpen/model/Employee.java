package com.whatsOpen.model;

import javax.persistence.CascadeType;
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
@SequenceGenerator(name = "employee_seq", initialValue = 101)
@Table(name = "tb_employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer employeeScheduleId;
	
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "employee_schedule_id", referencedColumnName = "id")
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
	private EmployeeSchedule schedule;
	
	
//	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "employee")
//	private EmployeeSchedule schedule;
//	
//	public EmployeeSchedule getSchedule() {
//		return schedule;
//	}
//	public void setSchedule(EmployeeSchedule schedule) {
//		this.schedule = schedule;
//	}
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getEmployeeScheduleId() {
		return employeeScheduleId;
	}
	public void setEmployeeScheduleId(Integer employeeScheduleId) {
		this.employeeScheduleId = employeeScheduleId;
	}


	
	
	

}
