package com.jslee.classes;
class CExam{ // class CExam 생성
	String hak; 
	String name;
	int jum;
	
	CExam(){ // class CExam 안에 동일한 이름의 CExam 생성자 생성
		hak = "213";
		name = "java";
		jum = 90;		
	}
	CExam(String con_hak) { // 생성자 CExam의 동일한 이름의 Method 오버로딩 // 문자형 매개변수 1개
		hak = con_hak;
		name = "babo";
		jum = 80;
	}
	CExam(String con_hak, String con_name){ // 생성자 CExam의 동일한 이름의 Method 오버로딩 // 문자형 매개변수 2개
		hak = con_hak;
		name = con_name;
		jum = 95;
	}
	void show() { // 각각 메소드의 객체들을 출력하기 위한 메소드 생성
		System.out.println(hak + " " + name + " " + jum);
	}
}

public class ConstructorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CExam c1 = new CExam(); // 객체 선언 , 첫번째 생성자 호출
		CExam c2 = new CExam("1234567"); // 객체 선언 , 두번째 생성자 호출
		CExam c3 = new CExam("987654","goo"); // 객체 선언 , 세번째 생성자 호출
		System.out.println("자바의 생성자");
		c1.show(); 
		c2.show();
		c3.show();
		// 각각의 변수들을 출력하기 위해 show method를 붙여서 출력
	}

}
