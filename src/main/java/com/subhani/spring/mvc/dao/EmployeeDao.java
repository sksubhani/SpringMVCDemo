package com.subhani.spring.mvc.dao;

import java.util.List;

import com.subhani.spring.mvc.beans.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployees();
	public Employee getEmployee(int empId);

}
