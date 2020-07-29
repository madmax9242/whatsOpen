package com.whatsOpen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "employee_seq", initialValue = 101)
@Table(name = "tb_employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

//	@OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "employee")
//	private EmployeeSchedule schedule;
//	
//	@OneToMany
//	@JoinColumn(name="employeeId")
//	private List<Shift> shift = new ArrayList<Shift>();

	public Employee() {

	}

	public Employee(Integer id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
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

//	public EmployeeSchedule getSchedule() {
//		return schedule;
//	}
//
//	public void setSchedule(EmployeeSchedule schedule) {
//		this.schedule = schedule;
//	}
//
//	public List<Shift> getShift() {
//		return shift;
//	}
//
//	public void setShift(List<Shift> shift) {
//		this.shift = shift;
//	}

	@Override
	public String toString() {
		return "Employee id=" + id +
				", firstName=" + firstName +
				", lastName=" + lastName +
				", email=" + email +
				", password=" + password;
	}
}
