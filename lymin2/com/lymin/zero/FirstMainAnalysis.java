package com.lymin.zero; // 패키지(꾸러미)의 경로

public class FirstMainAnalysis { // 클래스의 시작
	public static void main (String[] args) { // 메인 메소드의 시작
		System.out.println("FirstMainAnalysis is Start"); // 시스템에서 출력 새로운 줄로 프린트 하라. ln(Line New) 문자의 끝은 ':'로 닫아준다.
		
//		System.out.println(args[0].toString()); // 받아온 인자의 배열 첫번째 값을 출력.
		
		for (int i = 0; i < args.length; i++) { // 복수개의 인자 확인
			System.out.println(args[i].toString());
		}
		
	} // 메인 메소드의 끝
	
	
} // 클래스의 끝
