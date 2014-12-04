package org.crm.service;

import org.crm.entity.CousuStudent;

import page.Page;

public interface CousuService {

	Page list(int currPage, int pageSize);

	void save(CousuStudent cousuStu);

	CousuStudent findById(Integer id);

	void update(CousuStudent cousuStu);

	void inClass(Integer id, Integer clazzId);
	
}
