package com.jslee.inheritance;

class SuperClassExam { // SuperClassExam 클래스 생성
	SuperClassExam() { // 생성자 생성
		System.out.println("생성자 SuperClassExam() 호출");
	}

	public void methodZero() { // methodZero 메소드 생성
		System.out.println("SuperClassExam methodZero() 호출");
	}

	/*
	int methodTwo(int i) { // methodTwo 메소드 생성 정수형 매개변수 1개
		System.out.println("superClass methodTwo(int i)메소드 호출");
	}

	protected String methodThree(int i) { // methodThree 메소드 생성 returnType : String int 매개변수 1개
		System.out.println("SuperClass methodThree(int i)메소드 호출");
		return i;
	}
	오류 제거용 주석
	*/	
}

class SubClassExam extends SuperClassExam { // SubClassExam 클래스 생성 SuperClassExam 상속받음
	SubClassExam() { // SubclassExam 메소드 생성
		System.out.println("생성자 SubClass() 호출");
	}

	public void methodZero() { // methodZero 메소드 생성 return 없음
		System.out.println("SubClass methodZero() 메소드 호출");
	}

	public void methodOWn() { // methodOne 메소드 생성 return 없음
		System.out.println("SubClass methodOWn() 메소드 호출");
	}

	String methodThree(String s, int k) { // methodThree 메소드 생성 returnType: String String,int형 매개변수 각각 2개
		System.out.println("SubClass methodTwo() 메소드 호출");
		return s;
	}

	protected String methodThree(int k, String str) { // methodThree 메소드 오버로딩 매개변수의 갯수는 같지만 매개변수의 종류가 다르기 때문에 overriding이 아니다.
		System.out.println("SubClass methodThree() 메소드 호출");
		return str;
	}
	
	// methodThree는 매개변수가 다르고 부모가 가지고 있는 메소드를 자식이 가져가지 않았기 때문에 overriding이 아니다.
}

public class SuperClassExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassExam sp = new SuperClassExam();
		SubClassExam sb = new SubClassExam();
		// sb.methodThree(100); // 자식에는 없는 int형 매개변수 한개를 가지고 있는 메소드가 자식에게는 존재하지 않지만 부모에게 존재하기 때문에 호출이 가능하다.
		// sp.methodOwn(); // SuperClassExam에는 methodOwn 메소드가 존재하지 않기 때문에 호출할 수 없다.
		// sb.methodTwo(123); // 자식은 가지고 있지 않지만 부모가 가지고 있기 때문에 메소드 호출이 가능하다.

	}

}
