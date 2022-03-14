package com.example.myfirstapp.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Language {
	@Id
	private String id;
	private String name;
	private String desc;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@ManyToOne
	private Employee employee;



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Language(String id, String name, String desc,String employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.employee=new Employee("employeeId","","");
	}
	public Language() {
		super();
	}
}
