package com.lymin.classes;

public class SmartPhoneConstructorTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone();
		SmartPhone smartPhone = new SmartPhone("yourPhone"); // 생성과 동시에 생성자에 값을 전달하여 phoneName이 변경합니다.

		System.out.println("smartPhone.phoneName value is "
				+ "[" + smartPhone.phoneName + "]"); // 변경된 phoneName으로 접근하여 그 값이 출력 되는지 확인 합니다.
	}

}
