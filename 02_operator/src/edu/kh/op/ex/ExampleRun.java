package edu.kh.op.ex;




public class ExampleRun { //코드 실행용 클래스

	// 메인 메서드 필수작성
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//opexample 생성
		//-> OpExample이라는 클래스(설계도)를이용해서
		// 객체를 생성하는데, 그 객체 이름이 ex다.
		OpExample opEx = new OpExample();
		// 같은 패키지 (edu.kh.op.ex)안에있는 클래스는
		// import를 하지않아도 불러다 쓸수 있음

		opEx.ex1(); // opEx가 가지고있는 ex1()메서드 실행(호출)
		opEx.ex2();
		opEx.ex3();
		opEx.ex4();
	}

}
