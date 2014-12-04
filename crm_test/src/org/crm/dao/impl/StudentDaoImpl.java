package org.crm.dao.impl;

import java.util.List;

import org.crm.dao.StudentDao;
import org.crm.dao.base.impl.BaseDaoImpl;
import org.crm.entity.Clazz;
import org.crm.entity.Department;
import org.crm.entity.Student;
import org.hibernate.Session;

import page.Page;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

	@Override
		public Page list(int currPage, int pageSize) {
			int pageFirst = (currPage-1)*pageSize;
			String hql = "select count(id) from Student";
			Session sesssion = hibernateTemp.getSessionFactory().openSession();
			Long l = (Long) sesssion.createQuery(hql).uniqueResult();
			int rows = l.intValue();
			int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
			List<Department> list = sesssion.createQuery("from Student")
										.setFirstResult(pageFirst)
										.setMaxResults(pageSize).list();
			Page page = new Page(pageSize, totalPage, pageFirst, list);
			return page;
	}

	@Override
	public List<Student> findStuByClazz(Clazz clazz) {
		String hql = "from Student s where s.clazz=?";
		
		return hibernateTemp.find(hql, clazz);
	}

}
