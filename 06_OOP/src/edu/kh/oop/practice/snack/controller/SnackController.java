package edu.kh.oop.practice.snack.controller;

import edu.kh.oop.practice.model.vo.Snack;


//컨트롤러:사용자의 요청을받아 처리하고, 그 입력에따라 모델(데이터처리,비즈니스로직)과
// 뷰를 연결해주는역할

public class SnackController {

	
	private Snack s = new Snack();
	
	
	public SnackController() {
	}
	
	
	
	public String saveData(String kind, String name, String flavor,
			int numOf, int price) {
		
		
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
				return "저장완료"+"\n저장한정보를재확인(y/n) : ";
			
		
	}
	
	
	public String confirmData() {
		
		
		
		return s.information();
	}
	
	
	
	
	
	
	
}
