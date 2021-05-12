package com.divergentsl.cms.dao;

import java.util.List;

public interface BaseDAO<T> {

	public void insert(T employee);

	public T find(int id);

	public List<T> findAll();

	public void remove(int id);
	
	public void update(T data);

}
