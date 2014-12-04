package org.crm.dao;

import java.util.List;

import org.crm.dao.base.BaseDao;
import org.crm.entity.Clazz;

import page.Page;

public interface ClazzDao extends BaseDao<Clazz>{

	Page list(int currPage, int pageSize);

	List<Clazz> findNotEnd();
	
}
