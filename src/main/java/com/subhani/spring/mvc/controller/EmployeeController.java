package com.subhani.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.subhani.spring.mvc.beans.Employee;
import com.subhani.spring.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@GetMapping(path = "/employees/{employeeId}")
	public ModelAndView getOwner(@PathVariable int employeeId, ModelAndView model) {
		
		
		Employee employee = employeeService.getEmployee(employeeId);
		model.addObject("employee", employee);
		model.setViewName("employee");
		
		return model;
	}
	
	@GetMapping(path = "/employees")
	public ModelAndView getAllEmployees(ModelAndView model) {
		
		List<Employee> employeeList = employeeService.getEmployees();
		model.addObject("employeeList",  employeeList);
		model.setViewName("employeeList");
		
		return model;
	}
	

}
