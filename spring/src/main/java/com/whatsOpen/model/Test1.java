package com.whatsOpen.model;

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
@SequenceGenerator(name = "test_1_seq", initialValue = 301)
@Table( name="test_1")
public class Test1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="test_1_seq")
	private int id;
	private String name;
	
	@OneToOne(mappedBy = "test1", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Test2 test2;
	
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Test1(int id, String name) {
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

}
