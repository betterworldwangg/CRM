package org.crm.dao;

import org.crm.dao.base.BaseDao;
import org.crm.entity.Employee;

import page.Page;

public interface EmployeeDao extends BaseDao<Employee>
{
	public int check(Employee employee);

	public Boolean findByNandPass(Employee employee);

	public Page list(int currPage, int pageSize);
}
