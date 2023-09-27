package com.jslee.inheritance;

class Base{ // class Base 생성
	protected int x; // 자식에게만 상속되고 클래스 안에서만 사용할 수 있는 int x 생성
	// this는 클래스가 가지고 있는 자신의 값을 의미한다.
	
	Base(){ // 생성자 생성
		this.x = 0; // 클래스 안에 있는 x값에 0 대입 
	}	
	Base(int x){ // 생성자 오버로딩
		this.x = x; // 클래스 안에 있는 x값에 매개변수의 값을 대입하겠다는 뜻이다.
	}
	void print() { // print method 생성
		System.out.println("Base.x = " + x); // x값 출력
	}
}

class Derived extends Base{ // class Derived 생성 Base로부터 상속 받음
	int x; // int x 생성
	
	Derived(int x1, int x2){ // int 매개변수 두개를 가진 method Derived 생성 
		// super();는 항상 존재하고 있다. 자식 클래스는 부모 클래스를 반드시 호출해야 한다.
		super.x = x1; // class Base(부모)에 있는 x값에 x1 대입
		this.x = x2; // class Derived(자식)에 있는 x값에 x2 대입
	}
	void printSub() { // method printSub 생성
		super.print(); // Base(부모)에 있는 method print 호출 // super는 생략이 가능하지만 소속을 밝히기 위해 super를 표시했다.
		System.out.println("Derived.x = " + x); // x값 출력
	}
}



public class SuperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base a = new Base(10); // Base class 객체 생성, x 값에 10 대입
		System.out.println("-- a --");
		a.print(); // Base에 있는 method print 출력
		
		Derived b = new Derived(20, 30); // class Derived 객체 생성, x1과 x2에 각각 20,30 대입
		System.out.println("-- b --");
		b.printSub(); // Derived에 있는 method printSub 출력
		// b.print();어차피 상속받은 부모의 클래스는 모두 자식의 것이기 때문에 부모의 method print를 출력하는 것이 가능하다.
		
		Base c = new Derived(1,2); // 부모의 크기가 자식보다 크기 때문에 부모의 주머니에 자식 클래스를 담는 것도 가능하다.

	}

}
