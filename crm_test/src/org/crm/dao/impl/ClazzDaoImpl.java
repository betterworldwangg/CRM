package org.crm.dao.impl;

import java.util.List;

import org.crm.dao.ClazzDao;
import org.crm.dao.CourseDao;
import org.crm.dao.base.impl.BaseDaoImpl;
import org.crm.entity.Clazz;
import org.crm.entity.Course;
import org.crm.entity.Department;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import page.Page;

public class ClazzDaoImpl extends BaseDaoImpl<Clazz> implements ClazzDao {
	public Page list(int currPage, int pageSize) {
		int pageFirst = (currPage-1)*pageSize;
		String hql = "select count(id) from Clazz";
		Session sesssion = hibernateTemp.getSessionFactory().openSession();
		Long l = (Long) sesssion.createQuery(hql).uniqueResult();
		int rows = l.intValue();
		int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
		List<Department> list = sesssion.createQuery("from Clazz")
									.setFirstResult(pageFirst)
									.setMaxResults(pageSize).list();
		Page page = new Page(pageSize, totalPage, pageFirst, list);
		return page;
	}

	@Override
	public List<Clazz> findNotEnd() {
		// TODO Auto-generated method stub
		String hql = "from Clazz c where c.status != ?";
		List<Clazz> lists = hibernateTemp.find(hql, "已结课");
		return lists;
	}
 
}
