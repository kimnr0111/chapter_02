package com.javaex.ex05;

public class Location {
	
	private int x;
	private int y;

	
	public void setX(int x) {
		if(x<0) {
			this.x = 0;
		} else {
			this.x = x;
		}
		 
	}
	
	
	public int getX() {
		if(this.x<10) {
			return 0;
		} else {
			return x;
		}
		
	}
	
	public void setY(int y) {
		if(y<0) {
			this.y = 0;
		} else {
			this.y = y;
		}
		
	}
	
	
	public int getY() {
		return y;
	}
	
	
	public void draw( ) {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
