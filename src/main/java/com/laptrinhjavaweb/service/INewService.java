package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.entity.NewEntity;

public interface INewService {
	
	List<NewEntity> findAll();
	
	List<NewEntity> findByFirstName(String username);
	
	NewEntity findOne(Long id);
	
	boolean save(NewEntity newEntity);
	
	boolean update(NewEntity newEntity);
	
	void delete(Long id);

}
