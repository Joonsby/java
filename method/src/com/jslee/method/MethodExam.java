package com.jslee.method;

public class MethodExam {
	// sub1 메소드 선언 (매개변수 X return X)
	public void sub1() {
		System.out.println("---no argument ---"); // argument가 없다는 출력문  
	}
	// sub2 메소드 선언 (매개변수 O return X)
	public void sub2(int a, int b) { // int 형태의 매개변수 두개 선언
		int c; // 정수형의 변수 c 선언
		c = a + b; // 변수 c는 매개변수 a + b이다.
		System.out.println(a + "+" + b + " = " + c); // a + b = c라는 문장 출력
	}
	// sub3 메소드 선언(매개변수 O return O)
	public double sub3(int m, int n) { // 두개의 정수형의 변수 m , n 선언  
		double k; // double 형태의 변수 k 선언
		k = m + n; // 매개변수 m , n의 합 k 선언
		System.out.println(m + " + " + n + " = " + k); // m + n = k라는 문장 출력
		return k; // m + n = k를 메소드로 return
	}

	public static void main(String[] args) { // 메인 메소드
		// TODO Auto-generated method stub
		MethodExam ken = new MethodExam(); // 나의 클래스 변수명 = new 나의 클래스명(); 클래스 안에 있는 권한을 사용하겠다는 것
		System.out.println("***** method result *****"); // 메소드 결과 문장 출력
		ken.sub1(); // sub1 메소드 호출
		ken.sub2(30, 50); // sub2 매개변수에 각각 30 50을 대입하고 메소드 호출
		double w = ken.sub3(10, 20); // double 형태의 변수 w에 매개변수에 10, 20 을 각각 대입한 sub3 메소드를 호출한 값을 대입
		System.out.println("sub3(x , y) = " + w); // w값을 출력
	}

}
