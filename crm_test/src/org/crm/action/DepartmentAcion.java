package org.crm.action;

import org.crm.action.base.BaseAction;
import org.crm.entity.Department;
import page.Page;

public class DepartmentAcion extends BaseAction<Department>{

	public String list()
	{
		Page page = departServ.list(currPage,pageSize);
		push(page);
		list = page.getList();
		return "listSucc";
	}
	public String add()
	{
		departServ.save(model);
		return "addSucc";
	}
	public String delete()
	{
		Department dep = departServ.findById(model.getId());
		departServ.delete(dep);
		return "deleteSucc";
	}
	public String edit()
	{
		System.out.println(model);
		model = departServ.findById(model.getId());
		push(model);
		return "editUISucc";
	}
	public String realEdit()
	{
		Department de = departServ.findById(model.getId());
		de.setName(model.getName());
		de.setDescription(model.getDescription());
		departServ.update(de);
		return "updateSucc";
	}
	
}
