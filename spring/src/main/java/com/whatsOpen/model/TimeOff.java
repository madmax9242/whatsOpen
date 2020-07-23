package com.whatsOpen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@SequenceGenerator(name = "timeOff_seq", initialValue = 201)
@Table( name = "tb_time_off")
public class TimeOff{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timeOff_seq")
	private Integer id;
	private Integer employeeId;
	private String startDate;
	private String endDate;
	private String reason;
	
	
	public TimeOff() {
		
	}


	public TimeOff(Integer id, Integer employeeId, String startDate, String endDate, String reason) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reason = reason;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	@Override
	public String toString() {
		return "TimeOff [id=" + id + ", employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", reason=" + reason + "]";
	}
	
	
	
	
	
	
	
	

}
