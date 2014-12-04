package org.crm.dao;

import java.util.List;

import org.crm.dao.base.BaseDao;
import org.crm.entity.Course;
import org.hibernate.criterion.DetachedCriteria;

import page.Page;

public interface CourseDao extends BaseDao<Course> {

	Page list(int currPage, int pageSize);

	List<Course> highQuery(DetachedCriteria dct);
	
}
