package com.subhani.spring.mvc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	
	int employeeId;
	String employeeName;
	String deptId;
	@Autowired	
	Address employeeAddress;
	
}
