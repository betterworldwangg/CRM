package org.crm.entity;

import java.util.HashSet;
import java.util.Set;

public class Department
{
	private Integer id;
	private String name;
	private String description;
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Department()
	{}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
