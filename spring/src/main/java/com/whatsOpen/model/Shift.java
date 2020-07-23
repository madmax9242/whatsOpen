package com.whatsOpen.model;

import java.io.Serializable;
//import java.util.Date;
import java.sql.Date;

import javax.persistence.*;

@Entity
@SequenceGenerator(name ="shift_seq", initialValue = 401)
@Table(name = "tb_shift")
public class Shift implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shift_seq")
	private Integer id;
	
	private Date shiftDate;
	private String description;
	private Integer employeeId;
	
//	@ManyToOne
//    @JoinColumn(name="employee_id", insertable = false, updatable = false)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	private Employee employee;
//    @OnDelete(action = OnDeleteAction.CASCADE)
	
	
	
	public Shift() {}

	public Shift(Integer id, Date date, String description, Integer employeeId) {
		super();
		this.id = id;
		this.shiftDate = date;
		this.description = description;
		this.employeeId = employeeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return shiftDate;
	}

	public void setDate(Date date) {
		this.shiftDate = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Shift id= " + id + 
				", date= " + shiftDate + 
				", description= " + description;
	}
	
}
