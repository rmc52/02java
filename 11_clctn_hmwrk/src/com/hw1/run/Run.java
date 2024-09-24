package com.hw1.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		
		
				
		Friend f1 = new Friend("짱구");
		Friend f2 = new Friend("철수");
		Friend f3 = new Friend("유리");
		Friend f4 = new Friend("훈이");
		Friend f5 = new Friend("맹구");
		
		
		List<Friend> friend = new ArrayList<Friend>();
		
		
		friend.add(f1);
		friend.add(f2);
		friend.add(f3);
		friend.add(f4);
		friend.add(f5);
		
		
		Random random = new Random();
	
		
		System.out.println(friend.get(0));
		
				
		int i = random.nextInt(5)+1;
	
		switch(i) {
		
		case 1 : System.out.println(f1); break;
		case 2 : System.out.println(f2); break;
		case 3 : System.out.println(f3); break;
		case 4 : System.out.println(f4); break;
		case 5 : System.out.println(f5); break;
		
		}
		
		
		
		
		
		
		
		
	}

}
