package org.crm.service.impl;

import java.util.List;

import org.crm.dao.ClazzDao;
import org.crm.dao.StudentDao;
import org.crm.entity.Clazz;
import org.crm.entity.Student;
import org.crm.service.StudentService;

import page.Page;

public class StudentServiceImpl implements StudentService {
	private StudentDao stuDao;
	private ClazzDao clazzDao;
	
	public ClazzDao getClazzDao() {
		return clazzDao;
	}
	public void setClazzDao(ClazzDao clazzDao) {
		this.clazzDao = clazzDao;
	}
	@Override
	public Page list(int currPage, int pageSize) {
		return stuDao.list(currPage,pageSize);
	}
	public StudentDao getStuDao() {
		return stuDao;
	}
	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}
	@Override
	public Student findById(Integer id) {
		return stuDao.findById(id);
	}
	@Override
	public void update(Student stu, Integer clazzId) {
		Clazz oldClazz = stu.getClazz();
		Integer oldId = oldClazz.getId();
		if(!oldId.equals(clazzId))
		{
			oldClazz.setStuCounts(oldClazz.getStuCounts()-1);
			Clazz newClazz = clazzDao.findById(clazzId);
			newClazz.setStuCounts(newClazz.getStuCounts()+1);
			stu.setClazz(newClazz);
		}
		stuDao.update(stu);
	}
	@Override
	public List<Student> findStuByClazz(Clazz clazz) {
		// TODO Auto-generated method stub
		return stuDao.findStuByClazz(clazz);
	}
	
}
