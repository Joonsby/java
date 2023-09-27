package com.jslee.method;

import java.util.Scanner;

public class MethodArrayTest {
	
	int[] MethodArray(int n) { // idxArray라는 메소드 생성 매개변수 1개 return(O) 
		// 메인 메소드의 n과 매개변수의 n은 다른 n이지만 보통 개발할 때 헷갈리지 않기 위해서 변수명을 동일하게 맞추는 암묵적인 룰이 있다.
		// 배열을 리턴하기 때문에 형태를 맞추기 위해서 int[]를 사용한다.
		int[] a = new int[n]; // a라는 이름의 변수에 정수형의 배열 생성
		for (int i = 0; i < n; i++) {
			a[i] = i; // a의 i번째 배열에 i를 대입 
		}
		return a; // 배열인 a값을 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 스캐너 선언
		MethodArrayTest result = new MethodArrayTest(); // 클래스를 사용할수 있는 권한 허용
		System.out.print("요소 수는 : "); // 요소 수를 입력하기 위한 출력문
		int n = sc.nextInt(); // 사용자에게 정수형 입력값을 받음
		int [] x = result.MethodArray(n); // 리턴 받은 a값을 x라는 변수에 대입 
		
		for (int i = 0; i < n; i++) { // 사용자에게 받은 입력값만큼 반복 
			System.out.println("x[" + i + "] = " + x[i]); // 반복한 횟수만큼 출력
		}

	}

}
