package org.crm.dao.impl;

import java.util.List;

import org.crm.dao.DepartmentDao;
import org.crm.dao.base.impl.BaseDaoImpl;
import org.crm.entity.Department;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import page.Page;

public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		int pageFirst = (currPage-1)*pageSize;
		String hql = "select count(id) from Department";
		Session sesssion = hibernateTemp.getSessionFactory().openSession();
		Long l = (Long) sesssion.createQuery(hql).uniqueResult();
		int rows = l.intValue();
		int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
		List<Department> list = sesssion.createQuery("from Department")
									.setFirstResult(pageFirst)
									.setMaxResults(pageSize).list();
		Page page = new Page(pageSize, totalPage, pageFirst, list);
		return page;
	}
}
