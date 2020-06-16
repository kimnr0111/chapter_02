package com.javaex.ex10;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자를 이용해서 인스턴스 생성
		Point p1 = new Point();
		
		//setter 데이터입력
		p1.setX(5);
		p1.setY(5);
		
		//일반메소드 draw 이용 출력
		p1.draw(true);//2
		p1.draw(false);//3
		p1.draw();//1
		
		Point p2 = new Point(3, 3);
		
		p2.draw(true);
		p2.draw(false);

	}

}
