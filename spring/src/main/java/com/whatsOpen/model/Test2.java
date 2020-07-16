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
@SequenceGenerator(name = "test_seq", initialValue = 301)
@Table(name="test_2")
public class Test2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "test_seq")
	private int id;
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "test1_id", nullable = false)
	private Test1 test1;
	
	public Test2() {
		// TODO Auto-generated constructor stub
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
