package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.NewEntity;

@Repository
public interface NewRespository extends JpaRepository<NewEntity, Long>{
	List<NewEntity> findByUserName(String username);
}
