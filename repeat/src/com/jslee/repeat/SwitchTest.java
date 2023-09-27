package com.jslee.repeat;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = stdin.nextInt();
		String MtoS;
		switch (month) {
		case 12:
		case 1:
		case 2:
			MtoS = "겨울입니다.";
			break;
			// 12,1,2월의 경우
			// if문을 이용해서 표현하면
			// if (month == 12 || month == 1 || month == 2)로 표현할 수 있다.
		case 3:
		case 4:
		case 5:
			MtoS = "봄입니다";
			break;
			//3,4,5월의 경우
		case 6:
		case 7:
		case 8:
			MtoS = "여름입니다.";
			break;
			// 6,7,8월의 경우
		case 9:
			System.out.println("멋진 9월과");
		case 10:
			System.out.println("아름다운 10월과");
		case 11:
			System.out.println("낙엽의 11월은");
			MtoS = "가을입니다.";
			break;
			// 9,10,11월의 경우
		default:
			MtoS = "1~12월을 벗어난 달입니다.";
			break;
			// 1~12월을 제외한 나머지 숫자의 경우
		}
		System.out.println(MtoS);
	}

}
