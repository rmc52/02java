package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;

public class Zoo {

	
	
	private List<Animal> animals = new ArrayList<Animal>();
	
	
	
	
	


	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	public Zoo(List<Animal> animals) {
		super();
		this.animals = animals;
	}
	
	
	public void addAnimal(Animal animal) {
		
	};
	
	public void showAnimals() {
		
	}
	public void displayMenu() {
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return animals +"" ;
	}
	
}
