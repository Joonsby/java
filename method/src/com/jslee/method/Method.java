package com.jslee.method;

public class Method {
	
	// 메소드를 선언하는 방법
	// void 메소드명()
	// {
	// }	
	
	void method01() {
		System.out.println("method 1");
	}
	
	void method02(int x, double y) {
		// 정수형의 변수를 받아왔기 때문에 int 변수명을 지어줘야 한다.
		//	괄호안의 값은 매개변수, 인자, 인수라고 부른다.
		//	매개변수의 갯수와 형태를 동일하게 맞춰줘야 한다.
		//	매개변수를 한꺼번에 선언하는것도 안된다. ex) int x,y (X)
		System.out.println("method 2");
		System.out.println("main num = " + x);
	}
	
	int method03() {
		// void는 return이 없다는 뜻이다.
		// 그래서 return이 없을 때만 void를 사용한다.
		// 정수형을 return 하기 때문에 method앞에 int를 적어준다.
		// return을 선언하게 되면 프로그램을 더이상 실행하지 않기 method의 가장 아래로 와야한다.
		// return은 한개만 선별해서 가져갈 수 있다.
		// 매개변수와 return은 아무런 상관관계가 없기 때문에 같이 사용할수 있다.
		int su = 789;
		System.out.println("method 3");
		System.out.println("su = " + su);
		// main은 자동호출이기 때문에 다른 method로 호출할 수 없다.
		return su;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		method가 중요한 이유는 다른 사람의 코드를 이해하는데 있어서 굉장한 중요한 요소이기 때문이다.		
		남이 만들어 놓은 코드를 잘 보기 위해서는 본인도 잘 만들어야 한다.
		public static void main(String[] args) {}도 하나의 method이고 method에는 {}가 들어간다.
		main은 프로그램의 시작을 하는 기능이기 때문에 main method는 당연히 들어간다. main method가 없으면 method를 사용할 수 없다.
		method를 사용하지 않는다고 문제가 전혀 되지는 않는다. 프로그램이 다양해지고 많아지면 method를 사용하는 것이 불가피하다.
		method는 프로그램을 구성하는 하나의 부품이다. method 없이 main에 다 프로그래밍을 하면 유지보수가 굉장히 힘들다.
		따라서 유지보수를 원할하게 하기 위해서는 method를 활용하는 것이 좋다. 모든 프로그램이 전부 다 method로 구성되어 있기 때문에 method를 잘 아는 것이 중요하다.
		method는 기능을 만드는 것이다. method는 최소한으로 짧게 구성하는 것이 좋다. method 옆에는 무슨 method인지 주석을 달아야 한다.
		main method는 가장 먼저 호출되고 호출하지 않아도 자동으로 호출되는 유일한 method이다.
		main을 가장 아래에 배치하는 것이 암묵적인 룰이다.
		*/
		
		Method ob = new Method(); // 메소드를 사용하기 위해서 클래스를 받아온 것이다. 클래스이름 메소드이름 = new 클래스이름();
		Method ob2 = new Method();
		Method ob3 = new Method();
		int num = 111; // 111이라는 int 변수 생성
		
		System.out.println("main method"); // main method 출력
		System.out.println(num); // 111 출력
		ob.method01(); // 메소드를 호출하는 방법 : 메소드명();
		ob2.method02(num, 456); // method02 호출 parameter에 변수를 입력하면 선언한 변수를 method02로 데려갈 수 있다.
		int z = ob3.method03();
		System.out.println("method03 su = " + z);
	}

}
