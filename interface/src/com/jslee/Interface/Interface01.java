package com.jslee.Interface;

class hello {

}

// 인터페이스 Y 생성
interface Y {
	// int i; (X)
	int i = 123;

	void m();

}

// 인터페이스 Y를 상속받는 인터페이스 YY생성
interface YY extends Y {
}

// hello를 상속받고 인터페이스 Y를 implements하는 클래스 Z생성(다중상속이 안되기 때문에 implements 사용)
class Z extends hello implements Y {
	public void m() {
	}
}

public class Interface01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}

}
