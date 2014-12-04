package org.crm.action;

import java.util.List;

import org.crm.action.base.BaseAction;
import org.crm.entity.Course;
import org.crm.entity.HighQueryBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import page.Page;

public class CourseAction extends BaseAction<Course> {
	private HighQueryBean hqb = new HighQueryBean();
	
	public HighQueryBean getHqb() {
		return hqb;
	}
	public void setHqb(HighQueryBean hqb) {
		this.hqb = hqb;
	}
	public String list()
	{
		Page page = courseServ.list(currPage,pageSize);
		push(page);
		list = page.getList();
		return "listSucc";
	}
	public String add()
	{
		courseServ.save(model);
		return "addSucc";
	}
	public String edit()
	{
		Course cour = courseServ.findById(model.getId());
		push(cour);
		return "editSucc";
	}
	public String realEdit()
	{
		Course cour = courseServ.findById(model.getId());
		cour.setName(model.getName());
		cour.setTotalTime(model.getTotalTime());
		cour.setMoney(model.getMoney());
		cour.setDescription(model.getDescription());
		courseServ.update(cour);
		return "updateSucc";
	}
	public String query()
	{
		DetachedCriteria dct = DetachedCriteria.forClass(Course.class);
		dct.addOrder(Order.asc("id"));
		
		String name = model.getName();
		String description = model.getDescription();
		Integer timeDown = hqb.getTimeDown();
		Integer timeUp = hqb.getTimeUp();
		Double moneyDown = hqb.getMoneyDown();
		Double moneyUp = hqb.getMoneyUp();
		
		if(name != null && !name.trim().equals(""))
		{
			dct.add(Restrictions.like("name", name));
		}
		if(description != null && !description.equals(""))
		{
			dct.add(Restrictions.like("description", description));
		}
		if(timeDown != null && !timeDown.equals(""))
		{
			dct.add(Restrictions.ge("totalTime", timeDown));
		}
		if(timeUp !=null && !timeUp.equals(""))
		{
			dct.add(Restrictions.le("totalTime", timeUp));
		}
		if(moneyDown != null && !moneyDown.equals(""))
		{
			dct.add(Restrictions.ge("money", moneyDown));
		}
		if(moneyUp != null && !moneyUp.equals(""))
		{
			dct.add(Restrictions.le("money", moneyUp));
		}
		List<Course> cours = courseServ.highQuery(dct);
		list = cours;
		return "listSucc";
		
	}
}
