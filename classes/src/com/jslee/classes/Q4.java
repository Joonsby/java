package com.jslee.classes;

class Saram2 { // Saram2 클래스 생성
	String name;
	int age;
	String gender;

	void title() { // Saram2 클래스 안에 title 메소드 생성
		System.out.println("사람 이름 : " + name);
		System.out.println("사람 나이 : " + age);
		System.out.println("사람 성별 : " + gender);
		System.out.println("------------------");
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saram2[] saram1 = new Saram2[3]; // 갯수가 3개인 객체배열 생성
		
		for (int i = 0; i < saram1.length; i++) {
			saram1[i] = new Saram2(); // 각각의 배열에  메소드 호출
		}

		saram1[0].name = "철수";
		saram1[0].age = 26;
		saram1[0].gender = "남자";
		
		saram1[1].name = "영희";
		saram1[1].age = 24;
		saram1[1].gender = "여자";
		
		saram1[2].name = "민지";
		saram1[2].age = 21;
		saram1[2].gender = "여자";
		
		// 객체에 값을 집어 넣어줌
		
		for (int i = 0; i < saram1.length; i++) {
			saram1[i].title(); // title 메소드의 출력문을 반복 출력
		}
	}
	// 5번 문제를 풀때 객체 배열을 이용하는 것이 편할 것이다.
	// 처음부터 객체 배열을 사용하려면 어려울 수 있으니 다 만든 뒤에 사용하는 것이 좋다.
}
