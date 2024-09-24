package com.hw1.model.dto;

public class TextBook extends Book{

	private String subject;
	
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}


	public TextBook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}
	
	
	
	
	
	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
