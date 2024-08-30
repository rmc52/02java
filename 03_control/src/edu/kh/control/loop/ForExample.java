package edu.kh.control.loop;

public class ForExample { // 기능제공용 클래스

	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}	
	
	public void ex2() {
			// 영어알파벳 a부터 z까지 한줄로출력
			// abcdefghijkl....
			for(int i = 'a'; i<='z'; i++) {
				System.out.print((char)i); // 강제형변환
			}
	
		System.out.println("===================");
		
		for(char i = 'a'; i<='z'; i++) {
			System.out.print(i);
			
		}
	}
	
	
}
