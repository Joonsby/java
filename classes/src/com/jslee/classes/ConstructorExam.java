package com.jslee.classes;

class Puppy{ // Puppy라는 이름의 클래스 생성
	String str;
	int i;
	// Puppy안의 지역변수 선언
	Puppy(){ // Puppy 클래스 안에 동일한 이름의 Method 생성 -> 생성자 생성
		System.out.println("생성자 호출"); // 생성자가 호출 되면 "생성자 호출"이라는 문구 출력
		printPuppyName(); // 생성자가 호출되면 printPuppyName() 메소드 출력 
		// 같읕 클래스 안에 있는 메소드는 따로 메소드 호출문을 작성하지 않아도 호출이 가능하다.
		str = "메리"; // printPuppyName()이 실행된 후에 str 에 "메리"라는 이름을 대입 
		i = -98989; // printPuppyName()이 실행된 후에 i 에 -98989 숫자를 대입
	}
	public void printPuppyName() { // printPuppyName 메소드 생성
		System.out.println("printPuppyName() 호출");
		System.out.println("전역 변수 str = " + str + ", i = " + i);
	}
}

public class ConstructorExam {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy(); // 객체 생성과 동시에 생성자 호출 (생성자는 객체를 생성할 때 따로 호출하지 않아도 자동으로 호출된다.)
		p.printPuppyName();  // printPuppyName이라는 메소드를 호출하는 명령문
	}

}
