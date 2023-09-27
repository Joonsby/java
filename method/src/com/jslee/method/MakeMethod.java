package com.jslee.method;

public class MakeMethod {
	// 1번 메소드 (정수형,매개변수 2개, return (O))
	int method01(int x,int y) { // main 메소드에 있는 33,22값을 받아서 각각 int x, y에 대입한다.
		int result = x + y; // main 메소드에서 받아온 x y 값을 더한 result 변수를 만든다.
		return result; // result 변수를 32번째줄 main 메소드에 return 해준다. 
	}
	
	// 2번 메소드 (문자형, 매개변수 1개, return (O))
	String method02(String text) { // main 메소드에 있는 "java"라는 문자를 text라는 변수에 대입한다.
		System.out.println("출력할 문자는 [" + text + "]입니다."); // "java"라는 문자가 들어간 text라는 변수를 콘솔창에 출력한다.
		return text; // "java라는 문자가 들어간 text라는 변수를 35번째 줄에 있는 method에 return 해준다.
	}
	
	// 3번 메소드 (정수형, 매개변수 2개, return (O))	
	int methodExam03(int x, String y) { // main 메소드에 있는  정수 2023 과 문자열 "green"을 각각 x와 y에 대입해준다.
		System.out.println("현재 년도는 " + x + "년 입니다."); // 2023이 대입된 x를 출력한다.
		System.out.println("My favorite color is [" + y + "]"); // "green"이 대입된 y를 출력한다.
		return x; // x값을 38번째 줄에 return 해준다.
	}
	
	
	// 4번 메소드 (실수형, 매개변수 2개, return (O))
	double method04(double x, int y) { // main 메소드에 있는 실수 5.5와 정수 8을 매개변수에 대입해준다.
		double result = x * y; // x와 y 를 곱한 result라는 변수를 선언한다.
		System.out.println("x * y = " + result); // x * y = result 변수를 출력해준다.
		return result; // 41번째 줄에서 받아온 5.5 * 8 = 44.0의 결과를 매개변수 다시 return해준다.
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeMethod mme = new MakeMethod(); // Class의 권한을 사용가능하게 만들어 준다.
		int k = mme.method01(33,22); // 1번 메소드의 매개변수에 각각 33,22를 할당해준다.
		System.out.println(k); // 1번 메소드에서 return 받은 result값(33+22=55)를 출력한다.
		String s = mme.method02("java"); // 2번 메소드의 매개변수에 "java"라는 문자열을 대입해준다.
		System.out.println(s); // 2번 메소드에서 return 받은 java를 출력해준다.
		mme.methodExam03(2023,"green"); // 3번 메소드의 매개변수에 정수 2023, 문자열 "green"을 각각 대입해준다.
		double d = mme.method04(5.5,8); // 4번 메소드의 매개변수에 실수 5.5와 정수8을 대입해준뒤 return 값(44.0)을 받아서 변수 d에 저장해준다. 
		System.out.println(d); // 4번 메소드에서 return 받은 실수 5.5 * 8 = 44.0을 출력한다.
				
	}

}
