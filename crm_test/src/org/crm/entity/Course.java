package org.crm.entity;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private Integer id;
	private String name;
	private String description;
	private Integer totalTime;
	private Double money;
	private Set<Clazz> clazz = new HashSet<Clazz>();
	
	
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
	public Integer getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Set<Clazz> getClazz() {
		return clazz;
	}
	public void setClazz(Set<Clazz> clazz) {
		this.clazz = clazz;
	}
	
	
}
