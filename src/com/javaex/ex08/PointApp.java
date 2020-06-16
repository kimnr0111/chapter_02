package com.javaex.ex08;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//디폴트 생성자 이용해서 인스턴스생성
		Point p1 = new Point();
		
		//setter로 테이터 입력
		p1.setX(5);
		p1.setY(5);
		
		//toString() 확인
		System.out.println(p1.toString());
		
		//x, y 같이 세팅하는 생성자 이용 --> 추가만들어야함
		Point p2 = new Point(10, 10);
		
		//toString() 확인 <-- 디폴트 생성자 오류 확인
		//오류제거 --> 디폴트 생성자를 만든다
		System.out.println(p2.toString());
		
		p1.draw();
		p2.draw();

	}

}
