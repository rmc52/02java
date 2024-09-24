package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
public static void main(String[] args) {
	
	
	Zoo zoo = new Zoo();
	
	
	
	
	Tiger tiger = new Tiger("호랑이");
	
	Animal animal1 = tiger;
	
	Monkey monkey = new Monkey("원숭이");
	Animal animal2 = monkey;
	
	
	zoo.addAnimal(tiger);
	zoo.addAnimal(monkey);
	
	System.out.println(zoo);
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1 or 2");
	
	
	
	
	while( true ) {
		int i = sc.nextInt();
		if (i == 1) {
			
			System.out.println("울음소리");
			System.out.println(tiger);
			System.out.println(monkey);
			
		} else if (i == 2) {
			
			break;
		}else {
			System.out.println("x");
		}
		
		
		
	}
	
	
	
	
	
	
}
}
