package org.crm.action;

import java.util.List;

import org.crm.action.base.BaseAction;
import org.crm.entity.Clazz;
import org.crm.entity.CousuStudent;
import org.crm.entity.Student;

import page.Page;

public class CousuAction extends BaseAction<CousuStudent> {
	private Integer clazzId;
	
	public Integer getClazzId() {
		return clazzId;
	}
	public void setClazzId(Integer clazzId) {
		this.clazzId = clazzId;
	}
	public String list()
	{
		Page page = cousuServ.list(currPage,pageSize);
		push(page);
		list = page.getList();
		return "listSucc";
	}
	public String addUI()
	{
		List<Clazz> clazzs = clazzServ.findAll();
		setContextValue("clazzlist", clazzs);
		return "addUI";
	}
	public String add()
	{
		int clazzId = model.getClazz().getId();
		Clazz clazz = clazzServ.findById(clazzId);
		CousuStudent cousuStu = new CousuStudent();
		cousuStu.setName(model.getName());
		cousuStu.setAddres(model.getAddres());
		cousuStu.setSchool(model.getSchool());
		cousuStu.setQq(model.getQq());
		cousuStu.setPhoneNum(model.getPhoneNum());
		cousuStu.setAge(model.getAge());
		cousuStu.setSex(model.getSex());
		cousuStu.setEducation(model.getEducation());
		cousuStu.setDescription(model.getDescription());
		cousuStu.setClazz(clazz);
		
		cousuServ.save(cousuStu);
		return "addSucc";
	}
	public String edit()
	{
		CousuStudent cs = cousuServ.findById(model.getId());
		push(cs);
		List<Clazz> clazzs = clazzServ.findAll();
		setContextValue("clazzlist", clazzs);
		
		return "edit";
	}
	public String realEdit()
	{
		int clazzId = model.getClazz().getId();
		Clazz clazz = clazzServ.findById(clazzId);
		CousuStudent cousuStu = cousuServ.findById(model.getId());
		cousuStu.setName(model.getName());
		cousuStu.setAddres(model.getAddres());
		cousuStu.setSchool(model.getSchool());
		cousuStu.setQq(model.getQq());
		cousuStu.setPhoneNum(model.getPhoneNum());
		cousuStu.setAge(model.getAge());
		cousuStu.setSex(model.getSex());
		cousuStu.setEducation(model.getEducation());
		cousuStu.setDescription(model.getDescription());
		cousuStu.setClazz(clazz);
		
		cousuServ.update(cousuStu);
		
		return "updateSucc";
	}
	public String view()
	{
		CousuStudent stu = cousuServ.findById(model.getId());
		push(stu);
		return "viewSucc";
	}
	public String inClassUI()
	{
		CousuStudent stu = cousuServ.findById(model.getId());
		push(stu);
		clazzId = stu.getClazz().getId();
		List<Clazz> clazzs = clazzServ.findNotEnd();
		setContextValue("clazzs", clazzs);
		return "inClassUI";
	}
	public String inClass()
	{
		cousuServ.inClass(model.getId(),clazzId);
		return "inClassSucc";
	}
}
	
