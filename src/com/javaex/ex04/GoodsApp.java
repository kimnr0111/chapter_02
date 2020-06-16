package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		System.out.println("============");
		
		Goods cup = new Goods("머그컵", 2000);
		
//		cup.setName("머그컵");
//		cup.setPrice(2000);
		cup.showInfo();
	}

}
