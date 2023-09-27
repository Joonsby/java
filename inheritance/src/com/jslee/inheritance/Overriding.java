package com.jslee.inheritance;

// Overloading은 하나의 클래스 안에서 일어나는 것이고
// Overriding은 상속의 과정에서 재정의를 하면서 일어나는 것이다.

class Overriding01{
	void m() {}
	void m(int i) {}
	void mm() {
		System.out.println(" 부모 클래스 mm()");
	}
}
class Overriding02 extends Overriding01{
	// Overriding : 부모가 가지고 있는 메소드를 자식이 원하는 형태로 새롭게 정의해서 사용 하는것
	// 재정의는 returnType도 무조건 같고, method이름, 매개변수도 무조건 같아야 하고 내부 기능만 다르면 된다.
	// 재정의를 하려면 method를 복붙하고 내용만 바꾸면 된다.
	// Overloading : 이름같고, return 상관 없음, 매개변수 다름
	void m() { // void m을 재정의 한것이다.
		System.out.println(" 자식 클래스 mm()");		
	}	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding02 ob = new Overriding02();
		ob.m();
		ob.m(100);
		
	}

}
