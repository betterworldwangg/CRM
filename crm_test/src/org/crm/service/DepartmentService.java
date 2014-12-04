package org.crm.service;

import java.util.List;

import org.crm.entity.Department;

import page.Page;

public interface DepartmentService {

	Page list(int currPage, int pageSize);

	void save(Department depart);

	void delete(Department depart);

	Department findById(Integer id);

	void update(Department depart);

	List<Department> findAll();
	
}
