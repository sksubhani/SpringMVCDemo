package com.subhani.spring.mvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeConroller {

	/**
	 * Base URL to welcome the guest.
	 * URL: http://localhost:8080/SpringMVCDemo/
	 * @param model
	 * @return string
	 */
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcomeGuest(ModelMap model) {

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
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Guest");
		model.setViewName("index");
		return model;
	}
}
