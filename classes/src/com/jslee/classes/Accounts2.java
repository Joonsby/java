package com.jslee.classes;

// class를 이용해서 객체로 선언을 한 파일이다.
// method와 마찬가지로 main class가 바닥으로 가는것이 좋다.

class Account{ // 계좌관리 클래스 선언
	String name; // 필드 : 변수
	String no;
	int balance;
	void print() {
		System.out.println("고객 이름 :" + name);
		System.out.println("고객 계좌번호 :" + no);
		System.out.println("고객 잔액 :" + balance);
	}
	//클래스가 완벽해지려면 필드를 관리하고 작업할 수 있는 메소드가 들어가야 된다.
}

public class Accounts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account user1 = new Account(); // 새로운 객체 생성		
		user1.name = "철수";
		user1.no = "123456";
		user1.balance = 1000;
		
		Account user2 = new Account(); // 새로운 객체 생성
		user2.name = "영희";
		user2.no = "654321";
		user2.balance = 200;
		
//		System.out.println(" 고객 이름: " + user1.name);
//		System.out.println(" 고객 계좌번호: " + user1.no);
//		System.out.println(" 고객 잔액: " + user1.balance + "원");
//		
//		System.out.println(" 고객 이름: " + user2.name);
//		System.out.println(" 고객 계좌번호: " + user2.no);
//		System.out.println(" 고객 잔액: " + user2.balance + "원");
		// 메소드에 출력문을 집어넣었기 때문에 출력문은 필요 없어진다.
		user1.print();
		user2.print();

	}

}
