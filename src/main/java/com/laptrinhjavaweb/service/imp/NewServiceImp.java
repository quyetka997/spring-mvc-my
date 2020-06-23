package com.laptrinhjavaweb.service.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.NewRespository;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewServiceImp implements INewService {

	@Autowired
	NewRespository newRespository;
	
	SessionFactory session;
	
	@Transactional
	public List<NewEntity> findAll() {
		// TODO Auto-generated method stub
		return newRespository.findAll();
	}

	@Transactional
	public List<NewEntity> findByFirstName(String username) {
		// TODO Auto-generated method stub
		return newRespository.findByUserName(username);
	}

	@Transactional
	public NewEntity findOne(Long id) {
		// TODO Auto-generated method stub
		return newRespository.findOne(id);
	}

	@Transactional
	public boolean save(NewEntity entity) {
		// TODO Auto-generated method stub
		return newRespository.save(entity) != null;
	}

	@Transactional
	public boolean update(NewEntity entity) {
		// TODO Auto-generated method stub
		return newRespository.save(entity) != null;
	}

	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		newRespository.delete(id);
	}

}
