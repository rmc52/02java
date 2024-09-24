package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.TextBook;

public class Run {

	
	public static void main(String[] args) {
		
		
		Novel novel = new Novel();
		TextBook txtbook = new TextBook();
		Poetry pty = new Poetry();
		
		
		
		Book[] book = new Book[3];
		
		book[0] = novel; // new Novel("해리포터,"jk롤링,"판타지")
		book[1] = txtbook;
		book[2] = pty;
		
		
		novel.setTitle("해리포터");
		novel.setAuthor("jk롤링");
		novel.setGenre("판타지");
	
		txtbook.setTitle("자바프로그래밍");
		txtbook.setAuthor("제인스고슬링");
		txtbook.setSubject("컴퓨터과학");
		
		pty.setTitle("우리들의사랑시");
		pty.setAuthor("김소월");
		pty.setNumberOfPoems(30);
		
//		System.out.println(book[1].getTitle());
		
		String novel1 = book[0].getTitle();
		String novel2 = book[0].getAuthor();
		String novel3 = ((Novel)book[0]).getGenre();

		String txtbook1 = book[1].getTitle();
		String txtbook2 = book[1].getAuthor();
		String txtbook3 = ((TextBook)book[1]).getSubject();
		
		String pty1 = book[2].getTitle();
		String pty2 = book[2].getAuthor();
		int pty3 = ((Poetry)book[2]).getNumberOfPoems();
		
		
		System.out.printf("[소설] 제목 : %s / 저자 : %s  / 장르 :  %s", novel1, novel2, novel3);
		System.out.printf("\n[소설] 제목 : %s / 저자 : %s  / 과목 :  %s", txtbook1, txtbook2, txtbook3);
		System.out.printf("\n[소설] 제목 : %s / 저자 : %s  / 시 수 :  %s", pty1, pty2, pty3);
		
		
		System.out.println(book[0].toString());
		
	}
	
	
	
	
}





