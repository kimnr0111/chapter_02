package com.javaex.ex08;

public class Point {
	
	private int x, y;

	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//g/s
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
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	//toString()
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}