package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {
public void ex1() {
	
//	Animal a1 = new Animal(); // 객체화 불가
	
	
	Person p1 = new Person();
	
	p1.setName("홍길동");
	
	// 상속받은 기능
	p1.setType("척추동물중인간");
	
	
	Fish f1 = new Fish();
	f1.setType("척추동물중 어류");
	
}



public void ex2() {
	
	Animal a1 = new Person(); // 업캐스팅
	Animal a2 = new Fish(); // 업캐스팅
	
	
	
	Animal[] arr = new Animal[2];
	
	arr[0] = new Person("사람", "잡식", "김사람");
	
	arr[1] = new Fish("물고기", "잡식");
	
	// 업캐스팅
	
	//바인딩확인
	for(int i = 0; i <arr.length; i++) {
		arr[i].eat();
		arr[i].breath();
		System.out.println(arr[i].toString());
		
	}
	
	
	
}






}
