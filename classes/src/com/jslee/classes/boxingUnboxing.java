package com.jslee.classes;

public class boxingUnboxing {
	void boxingUnboxing1(){
		int i = 10; // 일반 변수 타입
		// Integer ii = new Integer(); // Integer은 생성자가 int와 String으로 각각 두개 존재하기 때문에 int 혹은 String 값을 집어 넣어야 한다. 이를 boxing이라고 표현한다.
		String s = new String("aaa"); // 이 방법이 원래 정상적인 방법이다.
		// if(i == 10) {} (O)
		// if(in == 10) {} (X)
		// if(in <= 10) {} (X)
		// if(s.equals("aaa")) {} (O)
		// in은 값이 아니고 객체이기 때문에 이런식으로 사용할 수 없다. 그래서 if(s.equals("aaa")) {}를 사용해야 한다.
		Integer in = new Integer(i); // Integer은 정수형의 데이터를 관리하는 클래스이다. Integer은 클래스이기 때문에 in은 객체이다.
		// 객체 타입은 연산을 할 수 없다.
		
		Boolean b = new Boolean(false);
		Long l = new Long("10");
		
		// 객체 타입을 일반 타입으로 바꾸는 것이 unboxing이다.
		int j = in.intValue(); // j에는 10이 들어간다.
		boolean bl = b.booleanValue();
		long lg = l.longValue();
		System.out.println(in + "-" + j);
	}
	
	void autoBoxingunboxing() {
		String s = "java"; // 이런식으로 변수를 선언하는 것이 autoBoxing이다.(객체 생성됨)
		
		Integer in = 10;
//		Integer in = new Integer(10); 위와 똑같은 것이다.
		
		Boolean bl = true;
		int i = in; // int j = in.intValue();
		boolean b = bl;
	}
	
	void StringToWrapper() {
		// String -> primitive(일반 {변수} 타입)으로 바꾸는거
		int r = Integer.parseInt("2030"); // 글자처럼 생긴 숫자여야 바꿀수 있다. 문자열이 들어가면 못 바꾼다 ex) "hello world"
		double d = Double.parseDouble("2030.12");
		boolean b = Boolean.parseBoolean("false");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	}

}
