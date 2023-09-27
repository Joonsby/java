package com.jslee.classes;

class ObjectOne { // ObjectOne class 생성
	int a; // 정수 a 선언
	ObjectOne(){ // Class와 동일한 이름의 생성자
		
	}
}

public class ObjectInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOne[] obj = new ObjectOne[5]; // 갯수가 5개인 [객체 배열]을 생성 -> 객체는 만들어지지 않았다. new는 배열 생성의 new이다.
		ObjectOne obj1 = new ObjectOne(); // 일반 객체를 생성한 것이다.

//		System.out.println(obj[0].a); // 존재하지 않는 (만들어지지 않은) 객체를 가지고 호출이 불가능하기 때문에 에러가 뜬다.
		for (int i = 0; i < obj.length; i++) { // 배열의 갯수가 5개이기 때문에 obj.length는 5다.
			System.out.print("생성전 : obj[" + i + "] = " + obj[i]);
			obj[i] = new ObjectOne(); // 객체를 생성한 곳
			// ()가 붙으면 객체가 생성 되는 것이고 []가 붙으면 배열이 생성 되는 것이다.
			System.out.println(", 생성후 : obj[" + i + "] = " + obj[i]);
			System.out.println(obj[0].a); // 객체를 생성한 이후이기 때문에 에러가 발생하지 않는다.
			// 다섯번 반복 된다.
		}
		System.out.println();

		for (int i = 0; i < obj.length; i++) { // 배열의 갯수가 5개이기 때문에 obj.length는 5다.
			System.out.println("변경전 : obj[" + i + "].a = " + obj[i].a);
			obj[i].a = i;
			System.out.println("변경후 : obj[" + i + "].a = " + obj[i].a);
		}
		System.out.println();
	}

}
