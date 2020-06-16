package com.javaex.ex15;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		
		Goods camera = new Goods("니콘", 400000);
		Goods cup = new Goods("머그컵", 2000);
		Goods computer = new Goods("LG그램", 1000000);
		
		camera.showInfo();
		cup.showInfo();
		computer.showInfo();
		System.out.println("=========================");
		
		goodsArray[0] = camera;
		goodsArray[1] = cup;
		goodsArray[2] = computer;
		
		for(int i=0;i<goodsArray.length;i++) {
			goodsArray[i].showInfo();
		}

	}

}
