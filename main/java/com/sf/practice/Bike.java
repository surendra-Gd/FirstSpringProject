package com.sf.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	@Autowired
	Tyre tyre;
	
	public void drive() {
		System.out.println("Bike is started " + tyre);
	}
}
