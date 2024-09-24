package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal{

public Fish() {
	// TODO Auto-generated constructor stub
}



public Fish(String type, String eatType) {
	super(type, eatType);
}



@Override 
public void eat() {
	System.out.println("ddd");
}

@Override
public void breath() {
	// TODO Auto-generated method stub
	super.breath();
}

@Override
public void move() {
	// TODO Auto-generated method stub
	super.move();
}


}
