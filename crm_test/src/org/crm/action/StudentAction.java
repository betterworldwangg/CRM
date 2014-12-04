package org.crm.action;

import java.util.List;

import org.crm.action.base.BaseAction;
import org.crm.entity.Clazz;
import org.crm.entity.Student;

import page.Page;

public class StudentAction extends BaseAction<Student> {
	private Integer clazzId;
	public String list()
	{
		Page page = stuServ.list(currPage,pageSize);
		push(page);
		list = page.getList();
		return "listSucc";
	}
	
	public String edit()
	{
		Student stu = stuServ.findById(model.getId());
		push(stu);
		clazzId = stu.getClazz().getId();
		List<Clazz> clazzs = clazzServ.findNotEnd();
		setContextValue("clazzs", clazzs);
		return "edit";
	}

	public Integer getClazzId() {
		return clazzId;
	}

	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}
	/**
	 * @return
	 */
	public String realEdit()
	{
		Student stu = stuServ.findById(model.getId());
		stu.setName(model.getName());
		stu.setAddres(model.getAddres());
		stu.setQq(model.getQq());
		stu.setSchool(model.getSchool());
		stu.setAge(model.getAge());
		stu.setSex(model.getSex());
		stu.setPhoneNum(model.getPhoneNum());
		stu.setEducation(model.getEducation());
		stu.setSpecial(model.getSpecial());
		
		stuServ.update(stu,clazzId);
		return "updateSucc";
		
	}
	public String view()
	{
		Student stu = stuServ.findById(model.getId());
		push(stu);
		clazzId = stu.getClazz().getId();
		List<Clazz> clazzs = clazzServ.findNotEnd();
		setContextValue("clazzs", clazzs);
		return "viewSucc";
	}
}
