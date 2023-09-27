package com.jslee.inheritance;

class Car{ // class Car 생성
	/*
	private : 클래스 안에서만 사용 가능한 명령어이다(전용). 상속 X
	public은 프로젝트 내에서 어디서나 사용이 가능하다(공용).
	protected : 전용이지만 상속은 가능하다. 자식은 public처럼 사용이 가능하다.
	*/
	String carname; // 문자열 carname 생성
	private int i; // 클래스 안에서만 사용가능
	protected int j; // 상속받은 자식만 사용가능
	public int cost; // 정수형 cost 생성
	void printAttributes() { // printAttributes method 생성
		System.out.println("carname = " + carname + "\t cost = " + cost); // carname의 값과 cost의 값을 출력한다.
		// System.out.println(" Audi a = " + a); -> 부모가 자식의 변수를 사용할 수 없기 때문에 에러가 뜬다.
	}
}

class Benz extends Car{ // Car 클래스를 상속 받음
	public Benz() { // 생성자 생성
		carname = "Benz"; // carname에 "Benz" 대입
		cost = 10000; // cost에 10000 대입
		// i = 123; private이기 때문에 Car 클래스 밖에서 사용할 수 없다.
		j = 10; // protected이기 때문에 상속받은 자식만 사용할 수 있고 나머지는 사용할 수 없다.
	}
}

class Audi extends Car{ // Car 클래스를 상속 받음	
	public Audi() {// 생성자 생성
		carname = "Audi"; // carname에 "Audi" 대입
		cost = 7000; // cost에 7000 대입
	}
}

class Bmw extends Car{ // Car 클래스를 상속 받음
	int a = 10;
	public Bmw() { // 생성자 생성
		carname = "Bmw"; // carname에 "Bmw" 대입
		cost = 8000; // cost에 8000대입
	}
}

public class Inhertance2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(); // Car 클래스 객체 선언
		Benz benz = new Benz(); // Benz 클래스 객체 선언
		Audi audi = new Audi(); // Audi 클래스 객체 선언
		Bmw bmw = new Bmw(); // Bmw 클래스 객체 선언
		
		c.printAttributes(); // Car클래스 안에 있는 printAttributes() 출력
		// c.i = 123;
		benz.printAttributes(); // Car을 상속 받은 benz의 값들을 대입 시켜서 생성자 출력
		audi.printAttributes(); // Car을 상속 받은 audi의 값들을 대입 시켜서 생성자 출력
		bmw.printAttributes(); // Car을 상속 받은 bmw의 값들을 대입 시켜서 생성자 출력
	}

}
