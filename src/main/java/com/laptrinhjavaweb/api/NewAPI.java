package com.laptrinhjavaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.service.INewService;

@RestController
public class NewAPI {
	
	@Autowired
	INewService newService;
	
	
	@GetMapping("/api/new")
	List<NewEntity> findAll() {
		return newService.findAll();
	}
	
	@GetMapping("/api/newbyname/{username}")
	List<NewEntity> findUserByName(@PathVariable String username) {
		return newService.findByFirstName(username);
	}
	
	@GetMapping("/api/new/{id}")
	NewEntity findUserByName(@PathVariable Long id) {
		return newService.findOne(id);
	}
	
	@PutMapping("/api/new")
	HttpStatus update(@RequestBody NewEntity newEntity) {
		return newService.save(newEntity) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@PostMapping("/api/new")
	HttpStatus insert(@RequestBody NewEntity newEntity) {
		return newService.save(newEntity) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@DeleteMapping("/api/new")
	void delete(Long id) {
		newService.delete(id);
	}
	
	
	
	

}
