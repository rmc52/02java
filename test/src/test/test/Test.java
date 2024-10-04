package test.test;

import java.util.ArrayList;
import java.util.List;

import test.model.dto.stdnt;

public class Test {
public static void main(String[] args) {
	
	
	List<stdnt> list = new ArrayList<stdnt>();
	
	list.add(new stdnt("강건강", 84));
	list.add(new stdnt("남나눔", 78));
	list.add(new stdnt("도대담", 96));
	list.add(new stdnt("류라라", 67));
	
	for(int i = 0; i< list.size(); i++) {
		stdnt s = list.get(i);
		System.out.println(s);
		
	}
	
	
	
}
}
