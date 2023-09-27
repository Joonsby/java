package com.jslee.method;

public class Overloading {
	
	// 첫번째 메소드
	void setOverload(int x) { // int 매개변수 1개, return (X) -> void 사용
		System.out.println(x);
	}

	// 두번째 메소드
	String setOverload() { // 매개변수 (X) return (O)
		System.out.println("String re = om.setOverload();");
		return null; // 매개변수가 없지만 return 값을 줘야 하기 때문에 null을 return
	}
	
	// 세번째 메소드	
	void setOverload(boolean x) { // boolean 매개변수 1개 return(X)
		System.out.println(x);		
	}
	
	// 네번째 메소드
	String setOverload(String x, String y) { // 매개변수 2개 return (O)
		System.out.println(x + "," + y);
		return x;
	}
	
	// 다섯번째 메소드
	void getOverload() { // 매개변수 X return X -> void 사용
		System.out.println("om.getOverload();");
	}
	
	// 여섯번째 메소드
	String getOverload(String x, String y) { // 정수형 매개변수 2개 return (O) 
		String result = x + y;
		System.out.println(result);
		return result;
	}
	
	// 일곱번째 메소드
	char getOverload(String x) { // String 매개변수 1개 return(O)
		System.out.println("char");
		return ' ';
		// return 0;도 사용이 가능하다 0~127까지 아스키코드로 char를 표현할 수 있기 때문이다
	}
	
	// 여덟번째 메소드
	float getOverload(float x) { // float 매개변수 1개 return(O)
		System.out.println("float");
		return x;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading om = new Overloading(); // 클래스를 사용가능하게 만든다
		om.setOverload(5); // int 매개변수 1개 return(X)
		String re = om.setOverload(); // String 매개변수 (X) return(O)
		om.setOverload(false); // boolean 매개변수 1개 return(X)
		om.setOverload("A","Java"); // String 매개변수 2개 return(X)
//		
		om.getOverload(); // 매개변수 X return X
		char ch = om.getOverload("hello"); // String 매개변수 1개 return(O) 
		om.getOverload("aa","BB"); // String 매개변수 2개 return(X)
		om.getOverload(5.2f); // float 매개변수 1개 return(X)
	}

}
