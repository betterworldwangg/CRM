package org.crm.service;

import java.util.List;

import org.crm.entity.Course;
import org.crm.entity.CousuStudent;
import org.hibernate.criterion.DetachedCriteria;

import page.Page;

public interface CourseService {

	Page list(int currPage, int pageSize);

	void save(Course model);

	Course findById(Integer id);

	void update(Course cour);

	List<Course> highQuery(DetachedCriteria dct);
	
	List<Course> findAll();

}
