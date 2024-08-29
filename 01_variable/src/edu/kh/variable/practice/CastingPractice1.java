package edu.kh.variable.practice;

public class CastingPractice1 {
public static void main(String[] args) {
	
	int iNum1 = 10;
	int iNum2 = 4;
	
	float fNum = 3.0f;
	
	double dNum = 2.5;
	
	char ch = 'A';
	
	//형변환 먼저 시행후 사칙연산
	System.out.println( iNum1 / iNum2 ); // 2 ,어차피인트라소숫점안붙음
	System.out.println( (int)dNum ); // 2
	System.out.println( iNum2 * dNum ); // 10.0
	System.out.println( (float)iNum1 ); // 10.0
	System.out.println( (double)iNum1 / iNum2 ); // 2.5
	System.out.println( dNum ); // 2.5
	System.out.println( (int)fNum ); // 3
	System.out.println( (int)(iNum1 / fNum) ); // 3
	System.out.println( iNum1 / fNum );// 3.3333333
	
	//float : 소수점 아래 8번째 자리까지 연산후 반올림
	
	System.out.println(iNum1 / (double)fNum ); // 3.3333333333333335
	
	//double : 소수점 아래 16번째 자리까지 연산후 반올림 맨뒤가 5인건 근사치관련
	
	System.out.println( "'"+ch+"'" ); // 'A' ★
	System.out.println( (int)ch ); // 65
	System.out.println( ch + iNum1 ); // 75 자동형변환됨
	System.out.println( "'"+(char)((int)ch + iNum1)+"'" ); // 'K'
	
	
	
	
	
}
}
