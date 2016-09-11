package com.subhani.spring.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhani.spring.mvc.beans.Employee;
import com.subhani.spring.mvc.dao.EmployeeDao;
import com.subhani.spring.mvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDao employeeDao;
	
	public List<Employee> getEmployees() {
		
		List<Employee> employeeList = employeeDao.getEmployees();
		return employeeList;
	}

	public Employee getEmployee(int empId) {
		
		Employee employee = employeeDao.getEmployee(empId);
		return employee;
	}

}
