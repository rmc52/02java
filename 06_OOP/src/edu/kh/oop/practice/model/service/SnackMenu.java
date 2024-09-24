package edu.kh.oop.practice.model.service;

import java.util.Scanner;

import edu.kh.oop.practice.snack.controller.SnackController;

public class SnackMenu {
	
	
	private Scanner sc = new Scanner(System.in);

	private SnackController scr = new SnackController();
	
	
	public void menu() {
		
		System.out.print("스낵류입력");
		System.out.print("종류");
		String kind = sc.next();
		System.out.print("이름");
		String name = sc.next();
		System.out.print("맛");
		String flavor = sc.next();
		System.out.print("개수");
		int numOf = sc.nextInt();
		System.out.print("가격");
		int price = sc.nextInt();

		//
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		scr.saveData(kind, name, flavor, numOf, price);
		
		
		String result = sc.next(); // y n
		
		if (result.equals("y")) {
			// 저장된데이터를 출력
			System.out.println(scr.confirmData());
			
			
			
		}
		
		
		
		
		
		
	}
	
	
}
