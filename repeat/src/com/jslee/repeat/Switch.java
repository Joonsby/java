package com.jslee.repeat;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//좋은 코드의 기준 = 가독성이 좋은 코드 -> 괄호를 깔끔하게 정리하는 것이 좋음.
		//if문이 길어졌을 때 switch문을 이용하면 더 간결하고 깔끔하게 코드 작성이 가능하다.
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("출생연도를 입력하세요");
		year = s.nextInt();
		
		switch(year % 12) {
		case 0 : System.out.printf("원숭이띠\n"); break;
		case 1 : System.out.printf("닭띠\n"); break;
		case 2 : System.out.printf("개띠\n"); break;
		case 3 : System.out.printf("돼지띠\n"); break;
		case 4 : System.out.printf("쥐띠\n"); break;
		case 5 : System.out.printf("소띠\n"); break;
		case 6 : System.out.printf("호랑이띠\n"); break;
		case 7 : System.out.printf("토끼띠\n"); break;
		case 8 : System.out.printf("용띠\n"); break;
		case 9 : System.out.printf("뱀띠\n"); break;
		case 10 : System.out.printf("말띠\n"); break;
		case 11 : System.out.printf("양띠\n"); break;
		}
		/*
		조건적용대상에 double은 들어갈 수 없다.
		ex) 0.0 과 0.00은 저장할 시스템을 다르게 갖추고 있기 때문에 컴퓨터가 인식할 때 서로 다른 숫자이다.
		소수점 자리까지 완벽하게 일치해야 double은 일치할 수 있다. double은 그래서 똑같다는 성립 자체가 거의 안된다.		
		case는 여러개를 넣을 수 있다.
		switch(조건적용대상){
		 값에는조건적용 대상이 가질수 있는 값을 대입한다.
		 case 값1: 실행문장; break;
		 case 값2: 실행문장; break;
		 case 값3: 실행문장; break;
		 case 값4: 실행문장; break;
		 default: -> if문의 else와 동일
		}
		if(평균>=90)
		if문은 범위를 가지고 질문할 때 사용하고 switch는 명확한 값을 가지고 질문할때 사용한다.
		*/
	}

}
