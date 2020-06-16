package com.javaex.ex04;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void showInfo() {
		System.out.println("상품명: " + name + "\n" + "가격: " + price);
	}

}
