package com.jslee.inheritance;
class SuperEx{ // SuperEx class 생성
	public SuperEx() { // 생성자 생성
		System.out.println(1);
	}
	
	public SuperEx(int i) { // 정수형 매개변수를 가진 생성자 오버로딩
		System.out.println(2);
	}
	
	public SuperEx(boolean b) { // boolean형 매개변수를 가진 생성자 오버로딩
		System.out.println(3);
	}
}

class Sub extends SuperEx{ // SuperEx 클래스를 Sub가 상속받음 
	public Sub() { // 생성자 생성
		// super(); 라는 문장이 생략되어 있다. 부모의 생성자도 찾아서 호출해야 되기 때문이다. 매개변수가 없는 1번을 호출한다.
		// 부모 생성자 호출 -> Super(); 원래 있는 문장이기 때문에 생략 가능하다.
		super(3); // super : 부모클래스를 지칭하는 키워드이다.
		// SuperEx(3);과 동일한 뜻이다.
		System.out.println(4); // 4번 Sub
	}
	public Sub(int a) { // 생성자 오버로딩
		this("A"); // this : 자기 자신을 지칭
		// Sub("A")와 동일한 문장이다.
		// SuperEx();가 생략되어 있다.
		System.out.println(5); // 5번 Sub	
	}
	public Sub(String s) { // 생성자 오버로딩
		super(true);
		System.out.println(6); // 6번 Sub
	}
}


public class Super01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Sub(); 2번(부모 생성자), 4번 Sub(자식 생성자) 호출
		// new Sub(3);  3번 -> 6번 -> 5번
		// new Sub(true); 4, 5, 6번 중에 boolean type이 없기 때문에 에러가 발생한다.
		// new Sub("A"); 3번 -> 6번 
		// 아무것도 적지 않으면 부모와 자식의 기본 생성자를 호출한다.
		/*
		자식은 생성자가 두개가 호출된다.
		부모와 자식 둘다 각각 생성자를 가지고 있기 때문이다.
		자식의 생성자는 무조건 부모의 생성자를 호출하게 되어있다.
		*/
	}

}
