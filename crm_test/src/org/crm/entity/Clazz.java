package org.crm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Clazz {
	private Integer id;
	private String name;
	private Date beginTime;
	private Date endTime;
	private String status;
	private Integer stuCounts;
	private Course course = new Course();
	private Set<CousuStudent> cousus = new HashSet<CousuStudent>();
	private Set<Student> students = new HashSet<Student>();
	
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
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getStuCounts() {
		return stuCounts;
	}
	public void setStuCounts(Integer stuCounts) {
		this.stuCounts = stuCounts;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<CousuStudent> getCousus() {
		return cousus;
	}
	public void setCousus(Set<CousuStudent> cousus) {
		this.cousus = cousus;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
