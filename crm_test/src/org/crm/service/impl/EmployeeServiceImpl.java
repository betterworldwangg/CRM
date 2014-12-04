package org.crm.service.impl;

import org.crm.dao.EmployeeDao;
import org.crm.entity.Employee;
import org.crm.service.EmployeeService;

import page.Page;
import util.MD5Utils;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employDao;
	
	public EmployeeDao getEmployDao() {
		return employDao;
	}

	public void setEmployDao(EmployeeDao employDao) {
		this.employDao = employDao;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		String pass = MD5Utils.md5(employee.getPassword());
		employee.setPassword(pass);
		employDao.save(employee);
	}

	@Override
	public int check(Employee employee) {
		// TODO Auto-generated method stub
		
		return employDao.check(employee);
	}

	@Override
	public Boolean findByNandPas(Employee employee) {
		// TODO Auto-generated method stub
		return employDao.findByNandPass(employee);
	}

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return employDao.list(currPage,pageSize);
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return employDao.findById(id);
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		employDao.update(emp);
	}
	
}
