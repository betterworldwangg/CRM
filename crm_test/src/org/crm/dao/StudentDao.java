package org.crm.dao;

import java.util.List;

import org.crm.dao.base.BaseDao;
import org.crm.entity.Clazz;
import org.crm.entity.Student;

import page.Page;

public interface StudentDao extends BaseDao<Student> {

	Page list(int currPage, int pageSize);

	List<Student> findStuByClazz(Clazz clazz);
	
}
