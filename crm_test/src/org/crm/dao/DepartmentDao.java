package org.crm.dao;

import org.crm.dao.base.BaseDao;
import org.crm.entity.Department;

import page.Page;

public interface DepartmentDao extends BaseDao<Department>
{

	Page list(int currPage, int pageSize);

}
