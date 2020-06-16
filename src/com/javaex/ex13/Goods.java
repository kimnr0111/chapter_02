package com.javaex.ex13;

public class Goods {
	
	private String name;
	private int price;
	private static int countGoods;
	
	
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.countGoods = countGoods + 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCountGoods() {
		return countGoods;
	}
	
	public void setCountGoods(int countGoods) {
		this.countGoods = countGoods;
	}
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countGoods=" + countGoods + "]";
	}
	
	

}
