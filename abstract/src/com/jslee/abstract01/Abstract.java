package com.jslee.abstract01;

public class Abstract {
	// abstract를 붙이는 것은 이 메소드를 사용하지 않겠다는 뜻이다.
	// class 앞에 abstract를 붙이게 되면 인터페이스와 거의 흡사해진다.
	// class 앞에 붙이면 누군가의 부모가 되고 기능은 없다.
	// method 앞에 붙이면 method를 재정의 해달라는 것이다.
	// method 앞에 abstract가 붙으면 class앞에도 abstract를 붙여서 추상클래스로 만들어줘야 한다.
	// public final class Integer은 default이다. 따라서 Integer 클래스는 상속해서 사용할수 없고 상속하게 되면
	// 오류가 난다.
	// final은 누구도 나를 임의로 수정할 수 없게 만드는 것이다.
	// method 앞에 final이 붙었을 때 overriding은 안되지만 overloading은 무관하다
	// 변수 앞에 final이 오면 상수가 된다. (변화하지 않는 값)
	// 값 변경 불가, 상수는 모두 대문자로 표현(권장사항)
	// 반드시 초기화해야 한다. (전역 변수도 초기화해야 함)
	// final이 class 앞에 오면 상속이 안된다. (객체 생성은 가능)
	// final이 선언되어 있지 않더라도 무조건 interface 안의 변수는 상수,method는 abstract method이다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 123;
		// i = 789; (X) final은 태어나자마자 고정값이 생긴것이기 때문에 오류가 난다
	}

}
