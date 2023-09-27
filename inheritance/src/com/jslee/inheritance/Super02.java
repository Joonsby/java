package com.jslee.inheritance;

class Ex {
	int i = 10; // 일반 타입

	void me() {
		Integer in = new Integer(10); // 객체(Object) 타입
		int j = in.intValue();
	}

/*
class ExEx extends Integer { // 정상적인 생성자를 부르지 않아서 에러가 난다.
	ExEx() {
		// 부모생성자를 무조건 호출해야 된다.
		// Integer();가 생략되어 있다.
		Integer("10");
		super(10);
	}
*/


	void mm() {
//		intValue();
	}
}

public class Super02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
