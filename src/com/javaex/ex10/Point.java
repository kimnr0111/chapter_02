package com.javaex.ex10;

public class Point {

	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter/setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//일반메소드 
	//1번
	public void draw() {
		System.out.println("점[x=" + x + "," + "y=" + y + "]을 그렸습니다.");
		System.out.println("1번");
	}
	
	public void draw(boolean action) {
		if(action == true) {	//2번
			System.out.println("점[x=" + x + "," + "y=" + y + "]을 그렸습니다.");
			System.out.println("2번");
		} else {				//3번
			System.out.println("점[x=" + x + "," + "y=" + y + "]을 지웠습니다.");
			System.out.println("3번");
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
