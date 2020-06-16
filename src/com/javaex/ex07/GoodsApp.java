package com.javaex.ex07;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(900000);
		
		System.out.println(camera.toString());
		
		
		Goods cup = new Goods("mugCup", 2000);
		
		System.out.println(cup.toString());

	}

}
