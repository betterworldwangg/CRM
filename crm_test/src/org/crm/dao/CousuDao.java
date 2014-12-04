package org.crm.dao;

import org.crm.dao.base.BaseDao;
import org.crm.entity.CousuStudent;

import page.Page;

public interface CousuDao extends BaseDao<CousuStudent> {

	Page list(int currPage, int pageSize);
	
}
