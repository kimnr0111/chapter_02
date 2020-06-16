package com.javaex.ex02;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Goods note = new Goods();
		Goods cup = new Goods();
		
		note.name = "\"LG그램\"";
		note.price = 900000;
		
		cup.name = "\"머그컵\"";
		cup.price = 2000;
			
		
		System.out.println("상품이름: " + note.name + "," + "\t" + "가격: " + note.price);
		System.out.println("상품이름: " + cup.name + "," + "\t" + "가격: " + cup.price);
		*/
		
		GoodsArray goods = new GoodsArray();
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println(goods.name.length);
		
		
		
		for(int i=0;i<goods.name.length;i++) {
			goods.name[i] = sc.nextLine();
			goods.price[i] = sc.nextInt();
		}
		*/
		
		
		goods.name[0] = "\"LG그램\"";
		goods.price[0] = 900000;
		goods.name[1] = "\"머그컵\"";
		goods.price[1] = 2000;
		
		
		for(int i=0;i<goods.name.length;i++) {
			System.out.println("상품이름: " + goods.name[i] + "," + "\t" + "가격: " + goods.price[i]);
		}
		
		
		

	}

}
