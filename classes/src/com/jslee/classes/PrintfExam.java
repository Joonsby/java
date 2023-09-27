package com.jslee.classes;

public class PrintfExam {

	public static void main(String[] args) {
		// printf는 출력 권한이 사용자한테 있다. 그렇기 때문에 형식을 직접 맞춰줘야 된다.
		// %f는 소수점까지 출력을 하는데 그 사이에 .숫자를 입력하면 몇번째 소수점까지 나타낼지 결정할 수 있다.
		// %20.3f는 20칸을 띄우고 소수점 세자리까지 표시하겠다는 의미이다.
		// %,d 가운데 있는 ,는 세자리 수마다 ,를 찍겠다는 의미이다.
		// $를 기입하면 년,월,일을 알기 때문에 날짜로 변환해서 출력한다.
		// %d는 정수의 형태로 출력된다.
		// %n은 줄바꿈이다.
		// TODO Auto-generated method stub
		System.out.printf("%d%d%n",30,20);
		System.out.printf("%d,%d%n",20,30);
		System.out.println();
		
		System.out.printf("가격 : %,d원%n",25320000);
		System.out.printf("%20.3f%n",35.33333);
		System.out.println();
		
		System.out.printf("%d년 %d월 %d일%n",2009,5,3);		
		System.out.printf("%2$d년 %3$d월 %1$d일%n",1,2005,3);
		System.out.println();
	}

}
