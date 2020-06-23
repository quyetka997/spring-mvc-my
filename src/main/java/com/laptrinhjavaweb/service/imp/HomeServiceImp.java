package com.laptrinhjavaweb.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.service.IHomeService;

@Service
public class HomeServiceImp implements IHomeService{

	public List<String> getMenu() {
		// TODO Auto-generated method stub
		List<String> lMenu = new ArrayList<String>();
		lMenu.add("Home");
		lMenu.add("Category");
		lMenu.add("Login");
		return lMenu;
	}

}
