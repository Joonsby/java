package com.jslee.operator;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// 국/영/수 점수 입력 -> 국/영/수,총점,평균,계산 출력
		// 평균이 90점이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점, 나머지는 F학점

		System.out.println("국어 점수를 입력하세요.");		
		int score1 = in.nextInt();//국어 점수
		
		System.out.println("영어 점수를 입력하세요.");
		int score2 = in.nextInt();//영어 점수
		
		System.out.println("수학 점수를 입력하세요.");
		int score3 = in.nextInt();//수학 점수
		
		int sum = score1 + score2 + score3;//총점
		double average = sum / 3;//평균
		//연산결과 char < int < double
		//자료형이 큰 쪽으로 맞춰진다.
		//&&는 두개의 조건이 맞아야 한다.
		//||는 둘 중 하나의 조건이 맞아도 된다.
		char grade;//학점
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}		
		System.out.println("국어 점수는 [" + score1 + "]점 입니다.");
		System.out.println("영어 점수는 [" + score2 + "]점 입니다.");
		System.out.println("수학 점수는 [" + score3 + "]점 입니다.");
		System.out.println("총점은 [" + sum + "]점 입니다.");
		System.out.println("평균 점수는 [" + average + "]점 입니다.");
		System.out.println("학점은 [" + grade + "]입니다.");
	}

}
