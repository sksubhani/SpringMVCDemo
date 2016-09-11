package com.subhani.spring.mvc.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Department {

	int deptId;
	String deptName;
	
}
