package com.lymin.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		RemoCon remoCon;
		remoCon = new Radio(); // 인터페이스를 선언하고, 선언된 인터페이스에 객체를 생성해서 넣습니다.
		// RemoCon remoCon = new Radio(); 로 줄이셔도 됩니다.

		remoCon.setOn(); // 재정의된 메소드의 호출
		remoCon.setInfoMenu(); //재정의된 메소드의 호출
		
		System.out.println("RemoCon.UID value is [" + RemoCon.UID + "]"); // static final(상수) 필드 확인.
		System.out.println("RemoCon.PRODUCT_ID value is [" + RemoCon.PRODUCT_ID + "]"); // static final(상수) 필드 확인.

		RemoCon.alertError(); // static method의 호출.
		
		System.out.println("--------------------");
		
		RemoCon remoConTwo = new Tv();
		remoConTwo.setOn();
		remoConTwo.setOff();
		remoConTwo.setInfoMenu();
		
		RemoCon.alertError();
	}

}
