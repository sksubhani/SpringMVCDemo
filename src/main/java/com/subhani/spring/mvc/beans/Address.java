package com.subhani.spring.mvc.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {

	String street1;
	String street2;
	String unitNum;
	String city;
	String state;
	int zip;
	int zipExtn;
	
	
}
