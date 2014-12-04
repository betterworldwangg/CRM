package org.crm.dao.base;

import java.util.List;

public interface BaseDao<T> {
	void save(T entity);

	void delete(T entity);

	T findById(Integer id);

	void update(T entity);

	List<T> findAll();

}
