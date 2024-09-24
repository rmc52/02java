package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionService {

	
	
	
	// 예외(익셉션): 소스코드의 수정으로 해결가능한 오류
	
	
//	예외는 두종류로 구분... 언체크드, 체크드
	
	
	private Scanner sc = new Scanner(System.in);
	
public void ex1() {
	
	System.out.println();
	
	
	//어리스매틱 익셉션 : 산술적예외
	
	
	
	try {
		
		//예외가 발생할거같은 코드
		
	} catch(ArithmeticException e) {
		
		
		
	}
	
	
	
}
	
public void  ex2()	{
	
	
	
}
public void  ex3()	{
	
	
//	try - catch - finally
	
	
	
	
	
	
}

public void  ex4()	{
	
	try {
		methodA();
	}catch(Exception e) {
		System.out.println("methodC 에서부터발생한예외를 ex4에서 잡아처리");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
public void methodA() throws IOException{
	methodB();
}

public void methodB() throws IOException{
	methodC();
}

public void methodC() throws IOException {
	throw new IOException();
}

public void  ex5()	{
	
}




}
