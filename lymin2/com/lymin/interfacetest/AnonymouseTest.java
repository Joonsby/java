package com.lymin.interfacetest;

public class AnonymouseTest {
	public static void main(String[] args) {
		RemoCon remoCon = new RemoCon() { // 언터페이스 변수 = new 인터페이스
			@Override
			public void setOn() { // 인터페이스에 정의된 추상 메소드 재정의
				// TODO Auto-generated method stub
				System.out.println("--------SetOn Anonymouse-------");
			}
			
			@Override
			public void setOff() { // 인터페이스에 정의된 추상 메소드 재정의
				// TODO Auto-generated method stub
				System.out.println("--------SetOff Anonymouse-------");
			}
		}; // ; 로 끝남에 유의!
		remoCon.setOn(); 
		remoCon.setOff();
	}

}
