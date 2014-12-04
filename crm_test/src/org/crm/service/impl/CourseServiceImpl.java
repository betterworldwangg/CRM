package org.crm.service.impl;

import java.util.List;

import org.crm.dao.CourseDao;
import org.crm.entity.Course;
import org.crm.entity.CousuStudent;
import org.crm.service.CourseService;
import org.hibernate.criterion.DetachedCriteria;

import page.Page;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao;
	
	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public Page list(int currPage, int pageSize) {
		return courseDao.list(currPage,pageSize);
	}

	@Override
	public void save(Course model) {
		courseDao.save(model);
	}

	@Override
	public Course findById(Integer id) {
		return courseDao.findById(id);
	}

	@Override
	public void update(Course cour) {
		courseDao.update(cour);
	}

	@Override
	public List<Course> highQuery(DetachedCriteria dct) {
		return courseDao.highQuery(dct);
	}

	@Override
	public List<Course> findAll() {
		return courseDao.findAll();
	}
}
