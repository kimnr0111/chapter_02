package com.javaex.ex05;

public class LocationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Location x = new Location();
		 Location y = new Location();
		 
		 x.setX(11);
		 x.setY(5);
		 
		 y.setX(10);
		 y.setY(23);
		 
		 x.draw();
		 y.draw();
		 
		 System.out.println(x.getX());

	}

}
