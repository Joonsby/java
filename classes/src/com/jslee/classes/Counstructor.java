package com.jslee.classes;

/*
생성자
1.클래스 명과 동일한 이름의 메소드이다.
2.객체가 생성이 되면 자동으로 호출이 된다. 자동 호출 되는 또 다른 메소드는 메인 메소드이다. 생성자가 있으면 자동 호출을 막을 수는 없다.
3.생성자는 returnType의 자리가 아예 없다. 그래서 return이 아예 존재하지 않는다.
4.한번 밖에 호출이 안되기 때문에 ob.Exam()으로 호출할 수가 없다.
5.매개변수 처리는 가능하다.
*/

class Exam{
	int i;
	Exam(int k){
		System.out.println("생성자");
	}
	void method(String s) {
		System.out.println("메소드");
	}
}

public class Counstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Exam ob = new Exam(200); // Exam 클래스에 객체 생성과 생성자호출을 동시에 하고 있는 것이다.
		// ob.Exam(); -> error
		ob.method("aaa");
	}
}
