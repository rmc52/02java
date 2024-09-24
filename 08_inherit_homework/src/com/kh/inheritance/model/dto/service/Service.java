package com.kh.inheritance.model.dto.service;

import com.kh.inheritance.model.dto.Phone.BasicPhone;
import com.kh.inheritance.model.dto.Phone.Phone;
import com.kh.inheritance.model.dto.Phone.SmartPhone;

public class Service {

	
	
	public void ex1() {
		
		Phone p = new Phone();
		
		p.setBrand("samsung");
		p.setModel("galaxy s20");
		p.setPrice(2020);
		p.setYear(1200000);
		
		System.out.println(p.getBrand());
		System.out.println(p.getModel());
		System.out.println("price"+p.getPrice()+"원");
		
		System.out.println(p.getYear());
		
		
		
		SmartPhone s = new SmartPhone();
		
		s.setOperatingSystem("Android");
		s.setStorageCapacity(128);
		
		
		System.out.println("=======");
		
		
		BasicPhone b = new BasicPhone();
		
		
		b.setBrand("Nokia");
		b.setModel("3310");
		b.setYear(2000);
		b.setPrice(100000);
		
		b.setHasPhysicalKeyboard(true);
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
}
