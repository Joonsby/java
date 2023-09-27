package com.jslee.classes;

class Saram { // Saram 클래스 생성
	String name;
	int age;
	String gender;

	void title() { // Saram 클래스 안에 title 메소드 생성
		System.out.println("사람 이름 : " + name);
		System.out.println("사람 나이 : " + age);
		System.out.println("사람 성별 : " + gender);
		System.out.println("------------------");
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saram saram1 = new Saram();
		Saram saram2 = new Saram();
		Saram saram3 = new Saram();
		// 새로운 객체 생성

		saram1.name = "철수";
		saram1.age = 26;
		saram1.gender = "남자";

		saram2.name = "영희";
		saram2.age = 21;
		saram2.gender = "여자";

		saram3.name = "민지";
		saram3.age = 24;
		saram3.gender = "여자";
		// 객체에 값을 집어 넣어줌

		saram1.title();
		saram2.title();
		saram3.title();
		// title 메소드 호출
	}

}
