package com.javaex.ex12;

import java.util.Scanner;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(120, 20, false);
		Scanner remote = new Scanner(System.in);
		int control;
		boolean ctrl=true;
		
		tv.status();
		
		while(ctrl) {
			
			try {
				System.out.println("1.전원 2.채널▲ 3.채널▼ 4.음량▲ 5.음량▼ 6.직접입력 7.나가기");
				control = remote.nextInt();
				if(tv.isPower() == true) {
					switch(control) {
					case 1:
						tv.power(true);
						tv.status();
						break;
					case 2:
						tv.channel(true);
						tv.status();
						break;
					case 3:
						tv.channel(false);
						tv.status();
						break;
					case 4:
						tv.volume(true);
						tv.status();
						break;
					case 5:
						tv.volume(false);
						tv.status();
						break;
					case 6:
						System.out.println("1.채널 2.음량");
						control = remote.nextInt();
						switch(control) {
						case 1:
							System.out.print("채널변경(1~255):");
							control = remote.nextInt();
							tv.channel(control);
							break;
						case 2:
							System.out.println("음량조절(0~100):");
							control = remote.nextInt();
							tv.volume(control);
							break;
						}
						tv.status();
						break;
					case 7:
						ctrl = false;
						break;
					default:
						System.out.println("1~6의 숫자 입력");
						break;
					}
				} else {
					switch(control) {
					case 1:
						tv.power(true);
						tv.status();
						break;
					case 2:
						tv.status();
						break;
					case 3:
						tv.status();
						break;
					case 4:
						tv.status();
						break;
					case 5:
						tv.status();
						break;
					case 6:
						tv.status();
						break;
					case 7:
						ctrl =false;
						break;
					default:
						System.out.println("1~6의 숫자 입력");
						break;
					}
					
				}
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요");
				remote.next();
			}
			
		}
		
		remote.close();
		
		System.out.println("=========================");
		tv.status();


		


	}

}
