package com.jslee.operator;

public class Operator1 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		// 성적관리 프로그램
		// 이름, 국/영/수 점수, 총점, 평균, 학점
		String name = "jslee"; // 이름
		int score1; // 국어 점수
		double score2; // 영어 점수
		int score3; // 수학 점수
		double sum; // 총점
		double average; // 평균
		char grade; // 학점
		// int : 정수
		// double : 실수
		// String : 문자열
		// char

		int num = 10;
		System.out.println("result = " + 10 % 2);// 0
		//데이터를 연산할때 %를 많이 사용한다.
		//double은 %(나머지)를 사용할수 없다. 소수점을 사용하면 나머지는 무조건 0이 나오기 때문이다.
		System.out.println(10 == 2); // true, false 로 나옴
		// = : 대입을 의미힌다. == : 같다는 것을 의미한다.
		System.out.println("증감연산자" + num++ + "," + num);// 10,11
		//++가 뒤로가면 앞으로 1만큼 늘어날것이라고 예약만 걸어놓은 상태
		//++가 앞으로 가면 즉시 적용해서 1만큼 늘어난 상태
		// 갑작스러운 흐름 때문에 보통 ++를 뒤에 많이 쓴다.
		
		//제어문:프로그램 흐름(방향)
		//조건문:if,switch
		//반복문:for,while
		//분기문:break,continue
		
		/*
		if(조건식) // 1
		{
		  실행문장; // 2
		}
		//3

		1 -> true -> 2 -> 3
		1-> false -> 3

		if(조건식)
		{
		  실행문장;
		}
		else // 가장 가까이 있는 if문을 부정
		{
		 실행문장;
		} // 4
		
		1 -> true -> 2 -> 4
		1 -> false -> 3 -> 4
		
		if(조건식)
		{
		 실행문장;
		}
		 else if(조건식)
		{
		  실행문장; 
		}
		*/
	}

}
