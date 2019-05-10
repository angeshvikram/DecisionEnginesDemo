package com.angeshde.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private String id;
	private Integer registration;
	private String name;

	public Employee() {
	};

	public Employee(String id, Integer registration, String name) {
		super();
		this.id = id;
		this.registration = registration;
		this.name = name;
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
