package com.subhani.spring.mvc.service;

import java.util.List;

import com.subhani.spring.mvc.beans.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployee(int empId);
	
}
