package org.crm.dao.impl;

import java.util.List;

import org.crm.dao.CousuDao;
import org.crm.dao.base.impl.BaseDaoImpl;
import org.crm.entity.CousuStudent;
import org.crm.entity.Department;
import org.hibernate.Session;

import page.Page;

public class CousuDaoImpl extends BaseDaoImpl<CousuStudent> implements CousuDao {

	@Override
	public Page list(int currPage, int pageSize) {
		int pageFirst = (currPage-1)*pageSize;
		String hql = "select count(id) from CousuStudent";
		Session sesssion = hibernateTemp.getSessionFactory().openSession();
		Long l = (Long) sesssion.createQuery(hql).uniqueResult();
		int rows = l.intValue();
		int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
		List<Department> list = sesssion.createQuery("from CousuStudent")
									.setFirstResult(pageFirst)
									.setMaxResults(pageSize).list();
		Page page = new Page(pageSize, totalPage, pageFirst, list);
		return page;
	}
	
}
