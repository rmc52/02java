package com.hw2.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
public static void main(String[] args) {
	
	
	Zoo zoo = new Zoo();
	
	
	
	
	Animal tiger = new Tiger("호랑이");
	
	
	Animal monkey = new Monkey("원숭이");
	
	
	List<Animal> animals = new ArrayList<Animal>();
	
	animals.add(monkey);
	animals.add(tiger);
	
	
	
	
	
	System.out.println(zoo);
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1 or 2");
	
	
	
	
	while( true ) {
		int i = sc.nextInt();
		if (i == 1) {
			
			System.out.println("울음소리");
			System.out.println(tiger);
			System.out.println(monkey);
//			((Monkey) animals).sound();
			System.out.println(animals);
			System.out.println();
			
		} else if (i == 2) {
			
			break;
		}else {
			System.out.println("x");
		}
		
		
		
	}
	
	
	
	
	
	
}
}
