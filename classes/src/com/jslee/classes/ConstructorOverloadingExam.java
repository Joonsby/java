package com.jslee.classes;

class PuppyExam { // PuppyExam 클래스 생성
	PuppyExam() { // 생성자 생성
		System.out.println("생성자  출력");
	}

	PuppyExam(String A) { // 생성자 오버로딩 생성 (String 매개변수 1개)
		System.out.println("매개변수 값은 [" + A + "] 입니다.");
	}

	PuppyExam(String Java, String Hi) { // 생성자 오버로딩 생성 (String 매개변수 2개)
		System.out.println("매개변수 값은 [" + Java + "," + Hi + "] 입니다.");
	}

	PuppyExam(char F) { // 생성자 오버로딩 생성 (Char 매개변수 1개)
		System.out.println("매개변수 값은 [" + F + "] 입니다.");
	}

	PuppyExam(boolean isTrue) { // 생성자 오버로딩 생성 (boolean 매개변수 1개)
		System.out.println("매개변수 값은 [" + isTrue + "] 입니다.");
	}
}

public class ConstructorOverloadingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuppyExam p1 = new PuppyExam();

		PuppyExam p2 = new PuppyExam("A");

		PuppyExam p3 = new PuppyExam("Java", "Hi");

		PuppyExam p4 = new PuppyExam('F');

		PuppyExam p5 = new PuppyExam("true");

		// 객체 선언과 동시에 생성자가 호출이 된다.
	}

}
