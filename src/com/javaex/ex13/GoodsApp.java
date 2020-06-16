package com.javaex.ex13;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods computer = new Goods("LG그램", 1000000);
		
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		

	}

}
