package com.laptrinhjavaweb.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView Home() {
		System.out.println("Home");
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
		
	}

}
