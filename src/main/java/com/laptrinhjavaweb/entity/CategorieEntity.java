package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategorieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name = "name", columnDefinition = "TEXT")
	String name;
	
	@Column(name = "nameVN")
	String nameVn;
	
	@OneToMany(mappedBy = "category")
	List<ProductEntity> products = new ArrayList();


	
	

}
