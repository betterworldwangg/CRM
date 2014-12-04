package org.crm.service;

import java.util.List;

import org.crm.entity.Clazz;

import page.Page;

public interface ClazzService {

	Page list(int currPage, int pageSize);

	void save(Clazz model);

	Clazz findById(Integer id);

	void update(Clazz clazz);

	List<Clazz> findAll();

	List<Clazz> findNotEnd();

}
