package com.jslee.exception;

import java.util.Random;

class Under18Exception extends Exception{
	public Under18Exception() {
		System.out.println("18세 미만은 금지!");
	}
}


// 개발자가 지정한 예외를 새롭게 정의해줌
class AdultOnlyShop{
	public void enterTheshop(int age) throws Under18Exception{ // Under18Exception메소드의 모든 문장을 try한다.
		if(age >= 18) {
			System.out.println("AdultOnlyShop");
		} else {
			throw new Under18Exception(); // 강제로 age가 18 이하면 예외를 발생시킨다.
		}
	}
}

public class NewExceptionExam{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdultOnlyShop en = new AdultOnlyShop();
		Random rnd = new Random();
		System.out.println("AdultOnlyShop");
		for (int i = 0; i < 10; i++) {
			int age = rnd.nextInt(55) + 1;
			System.out.println("================== 입장" + (i + 1) + " ");
			System.out.println("손님은 나이는 [" + age + "] 입니다.");
			try {
				en.enterTheshop(age);
			} catch(Under18Exception e) {
				System.out.println(e);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	

}
