package org.crm.service;

import org.crm.entity.Employee;

import page.Page;

public interface EmployeeService
{

	void save(Employee employee);

	int check(Employee employee);

	Boolean findByNandPas(Employee employee);

	Page list(int currPage, int pageSize);
	
	Employee findById(Integer id);

	void update(Employee emp);
	
}
