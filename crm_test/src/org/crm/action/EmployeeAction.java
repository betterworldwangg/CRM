package org.crm.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.crm.action.base.BaseAction;
import org.crm.entity.Department;
import org.crm.entity.Employee;
import org.crm.service.DepartmentService;
import org.crm.service.EmployeeService;

import page.Page;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends BaseAction<Employee>
{
	public String regist()
	{
		employServ.save(model);
		return "registSucc";
	}
	public String check() throws IOException
	{
		int i = employServ.check(model);
		ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		if(i==0)
		{
			ServletActionContext.getResponse().getWriter().write("有效用户名");
			
		}
		else
		{
			ServletActionContext.getResponse().getWriter().write("该用户名已被使用");
		}
		return null;
	}
	public String login()
	{
		Boolean bool = employServ.findByNandPas(model);
		if(!bool)
		{
			this.addActionError("用户名或密码错误");
			return INPUT;
		}
		ServletActionContext.getRequest().getSession().setAttribute("registName", model.getRegistName());
		return "loginSucc";
	}
	public String logout()
	{
		ServletActionContext.getRequest().getSession().invalidate();
		return "logoutSucc";
	}
	public String list()
	{
		Page page = employServ.list(currPage,pageSize);
		push(page);
		list = page.getList();
		return "listSucc";
	}
	public String edit()
	{
		Employee e = employServ.findById(model.getId());
		if(e.getDepart() != null)
		{
			deptId = e.getDepart().getId();
		}
		push(e);
		List<Department> lis = departServ.findAll();
		setContextValue("list", lis);
		return "editSucc";
	}
	public String realEdit()
	{
		Employee emp = employServ.findById(model.getId());
		emp.setRegistName(model.getRegistName());
		emp.setSex(model.getSex());
		emp.setBirthDay(model.getBirthDay());
		emp.setJoinDate(model.getJoinDate());
		Department dept = new Department();
		dept.setId(deptId);
		Department dep = departServ.findById(dept.getId());
		emp.setDepart(dep);
		emp.setEmpnum(model.getEmpnum());
		employServ.update(emp);
		return "updateSucc";
	}
}
