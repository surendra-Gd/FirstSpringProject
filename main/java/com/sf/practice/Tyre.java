package com.sf.practice;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;
	
	

//	public Tyre(String brand) {
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "It's working";
	}
	
	
	
	
}
