package com.subhani.spring.mvc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.subhani.spring.mvc.beans.Address;
import com.subhani.spring.mvc.beans.Employee;
import com.subhani.spring.mvc.dao.EmployeeDao;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getEmployees() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		Address address = new Address();
		address.setStreet1("202 S Juanita Ave");
		address.setCity("Los Angeles");
		address.setState("CA");;
		address.setZip(90004);
		employee.setEmployeeAddress(address);
		
		employee.setEmployeeId(101);
		employee.setEmployeeName("Subhani Shaik");
		employeeList.add(employee);

		employee = new Employee();
		employee.setEmployeeId(102);
		employee.setEmployeeName("Shakeela Shaik");
		employee.setEmployeeAddress(address);
		employeeList.add(employee);
		
		return employeeList;
	}

	public Employee getEmployee(int empId) {
		
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Subhani Shaik");
		
		return employee;
	}

}
