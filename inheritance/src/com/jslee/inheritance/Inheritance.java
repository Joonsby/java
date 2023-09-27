package com.jslee.inheritance;

class A{
	int i;
	void m() {
		// h = 789; 상속은 자식이 부모에게 받는 것이기 때문에 자식의 것을 사용할 수 없다.
		// 그렇기 때문에 부모는 아무것도 변하지 않는다.
	}
}

class B extends A{ // 부모의 부모인 할머니도 가능하다. 계층적 구조가 가능하다.
	int h;
	void method() {
		i = 456; // A(부모)가 선언한 i의 값에 456을 대입할 수 있다.
		m(); // A(부모)가 가지고 있는 method를 호출할 수 있다.		
	}
}

class X extends B //, X 다중상속은 불가능하다. 그래서 여러명의 부모를 가질 수 없다. // X라는 클래스가 B라는 클래스를 상속 받는다. A가 B의 부모가 된다. B가 A로 확장된다.
{
	
}

class C{
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new A();
		ob.i = 123;		
	}

}
