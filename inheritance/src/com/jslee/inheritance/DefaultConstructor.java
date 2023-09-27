package com.jslee.inheritance;

class AA{
	private int a; // 클래스 내에서만 사용할 수 있는 정수형 변수 a 선언
	AA(){ // 메소드 AA 호출
		a = 50;
	}
	int getA() { // a값을 리턴시키는 getA 변수 호출
		return a;
	}
}

class BB extends AA { // 클래스 BB가 AA로부터 상속 받음
	// 자식에게 생성자가 존재하지 않아도 있다.
	// 자식에게 생성자가 존재하지 않아도 부모의 생성자는 호출 된다.
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB x = new BB(); // BB 클래스 객체 생성
		System.out.println("x.getA() = " + x.getA()); // return 받은 a 값을 호출
	}

}
