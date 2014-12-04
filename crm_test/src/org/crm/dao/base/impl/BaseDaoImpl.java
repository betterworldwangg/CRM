package org.crm.dao.base.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.crm.dao.base.BaseDao;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDaoImpl<T> implements BaseDao<T> {
	
	protected HibernateTemplate hibernateTemp;
	private Class<T> clazz;
	
	
	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}

	public BaseDaoImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();// 获得父类（BaseDaoImpl）类型
		// 获取泛型数组
		Type[] typeArguments = type.getActualTypeArguments();
		clazz = (Class<T>) typeArguments[0];
	}

	@Override
	public void save(T entity) {
		
		hibernateTemp.save(entity);
	}

	@Override
	public void delete(T entity) {
		
		hibernateTemp.delete(entity);
	}

	@Override
	public T findById(Integer id) {
		
		return hibernateTemp.get(clazz,id);
	}

	@Override
	public void update(T entity) {
		
		hibernateTemp.update(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String hql = "from "+clazz.getSimpleName();
	
		return hibernateTemp.find(hql);
	}

}
