package com.subhani.spring.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subhani.spring.mvc.beans.Employee;

@Controller
public class WelcomeConroller {

	@Autowired
	public Employee employee;
	
	public static final Logger logger = Logger.getLogger(WelcomeConroller.class);
	
	/**
	 * Base URL to welcome the guest.
	 * URL: http://localhost:8080/SpringMVCDemo/
	 * @param model
	 * @return string
	 */
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcomeGuest(ModelMap model) {
		logger.debug("Received request for base path, /");
		
		model.addAttribute("name", "Guest");
		return "index";
	}

	/**
	 * Receive the guest name as path parameter and welcome the guest by his/her name.
	 * http://localhost:8080/SpringMVCDemo/hello/Subhani 
	 * @param name
	 * @return
	 */
	@RequestMapping(path = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {
		
		logger.debug("Received request for path, /hello/{name}");
		
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
	
	/**
	 * Welcome the guest and use ModelAndView to return the response.
	 * http://localhost:8080/SpringMVCDemo/welcome
	 * @return
	 */
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcome() {
		
		logger.debug("Received request for path, /welcome");
		
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Guest");
		model.setViewName("index");
		return model;
	}

}
