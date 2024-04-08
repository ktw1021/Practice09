package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	ArrayList<Goods> good = new ArrayList<>();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("상품을 입력해주세요(종료 q)");
       
       int sum = 0;
       
       while (true) {
       
    	   
    	String ask = sc.nextLine();
    	   
       if (ask.equals("q")) {
    	   System.out.println("[입력완료]");
    	   System.out.println("=================");
    	   break;
       }
       String [] a = ask.split(",");
       int a1 = Integer.parseInt(a[1]);
       int a2 = Integer.parseInt(a[2]);
       sum += a2;
       Goods go = new Goods(a[0],a1,a2);
       good.add(go);
       
       }
       
       for (int i = 0; i<good.size(); i++) {
    	   System.out.println(good.get(i));
       }
       System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
       sc.close();
    }

}
