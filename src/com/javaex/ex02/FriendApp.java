package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Friend f1 = new Friend();
    	Friend f2 = new Friend();
    	Friend f3 = new Friend();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요.");
    	
    	ArrayList<Friend> friren = new ArrayList<>();
    	
    	f1.setName(sc.next());
    	f1.setHp(sc.next());
    	f1.setSchool(sc.next());
    	friren.add(f1);
    	
    	f2.setName(sc.next());
    	f2.setHp(sc.next());
    	f2.setSchool(sc.next());
    	friren.add(f2);
    	
    	f3.setName(sc.next());
    	f3.setHp(sc.next());
    	f3.setSchool(sc.next());
    	friren.add(f3);
    	
    	for (int i = 0; i<friren.size(); i++) {
    	System.out.println(friren.get(i));
    	}
    	
    	sc.close();
    }

}
