package com.lymin.variable;

public class VariableTest {
	public static void main(String[] args) {
		System.out.println("Variable Test");
		
		int age; // 정수(int)값을 저장하는 age 변수 선언
		double realNumber; // 실수(double)값을 저장하는 value 변수의 선언.
		
//		System.out.println("int age value is ["+age+"]"); // 초기화 해 놓지 않으면 값이 출력되지 않는다.
//		System.out.println("double value value is ["+realNumber+"]"); // 초기화 해 놓지 않으면 값이 출력되지 않는다.
		
		int a, b, c; // 이렇게 선언 가능 합니다.
		
//		변수의 작성규칙
//		1. 변수의 첫글자는 숫자를 넣으면 안된다.
//		2. 영어의 대소문자 구별을 한다. 
//		3. 첫 문자는 소문자 그 다음은 첫문자를 대문자로 한다.  (maxNum)
//		4. 자바 예약어 사용금지 (ex: void, new, private, boolean 등)
		
		age = 10; // 변수의 사용
		System.out.println("int age value is ["+age+"]"); // 변수의 확인.
		
		int ageEx = 20; // 선언과 동시에 사용.
		System.out.println("int age value is ["+ageEx+"]"); // 변수의 선언과 사용 
		
		// 리터럴이란?
		//소스 코드내에서 직접 입력된 값을 리터럴(literal) 이라고 부른다.
				
		
	}

}
