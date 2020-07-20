package com.whatsOpen.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "employee_seq", initialValue = 101)
@Table(name = "tb_employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "employee")
	private EmployeeSchedule schedule;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee",cascade = CascadeType.ALL)
//	@JoinColumn(name="employee_id", nullable = true)
//	private List<Shift> shift = new ArrayList<Shift>();
	
	public Employee() {}

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

	public EmployeeSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(EmployeeSchedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + 
				", firstName=" + firstName + 
				", lastName=" + lastName + 
				", email=" + email +
				", password=" + password + 
				", schedule=" + schedule;
	}

}
