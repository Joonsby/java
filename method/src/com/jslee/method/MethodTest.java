package com.jslee.method;

public class MethodTest {
	/* Method이름 : method_01
	 ReturnType : 정수
	 Parameter : 정수 1개
	 (구현부에서)하는 일 :
	 "method_01이 호출되었습니다" 출력
	  정수*2 리턴
	  */
	  
  	int method_01(int x){ // 매개변수에 int x 값을 대입
	int result = x * 2; // 정수형 변수 result에 x * 2를 대입
	System.out.println("method_01이 호출되었습니다."); // method_01이 호출되었다는 메시지 출력
	return result; // result = x * 2 값을 리턴
  	}
	 
	  	
	 /* 	
	 Method이름 : method_02
	 ReturnType : String
	 Parameter: String 1개, 정수 1개
	 (구현부에서)하는일 :
	 "method_02가 호출되었습니다." 출력
	  인수로 받은 String에 바보를 붙여서 리턴
	 */
	  	
	String method_02(String text,int num) {
		text = "바보";
		System.out.println("method_02가 호출되었습니다." + text);
		return text;
	}
	 
	  /*
	  Method이름 : method_03
	  ReturnType : 리턴안함
	  Parameter : 정수 1개와 String 1개
	  (구현부에서)하는 일
	  "method_03이 호출되었습니다." 출력	
	   */
		
	public void method_03(int num, String text) {
		System.out.println("method_03이 호출되었습니다.");		
	}
	
	   /*
		Method이름 : method_04
		ReturnType : 실수형
		Parameter : 첫번째 인수(정수), 두번째 인수(실수), 세번째인수(정수)
		(구현부에서)하는 일 :
		methodExam03_04가 호출되었습니다. 출력 
		리턴값 지정
		*/
	
	double method_04(int x,double y, int z) {		
		System.out.println("y의 값은 " + y + "입니다");
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest ob = new MethodTest(); // 메소드를 사용하기 위해서 클래스를 받아옴
		
		// 첫번째 메소드 호출
		int method01 = ob.method_01(2);
		// return으로 반환 받은 값은 매개변수에 들어간 2 * 2 = 4가 출력된다.
		System.out.println("첫번째 메소드의 값은 " + method01 + "입니다.");
		// return 값을 받은 변수 method01은 4의 값을 가지므로 4가 출력된다.
		
		// 두번째 메소드 호출
		String method02 = ob.method_02("바보", 2);
		// 매개변수에 2를 입력해서 return을 했지만 받을 장소를 지정하지 않아서 정수 2는 저장하지 않았다.
		
		// 세번째 메소드 호출
		ob.method_03(3, "text");
		// return받을 매개변수는 존재하지 않지만 메소드 선언문과 호출문의 매개변수의 종류와 갯수를 맞추기 위해
		// 3과 "text"를 기입하였다.
		
		// 네번째 메소드 호출
		ob.method_04(1, 2, 3);
		// 매개변수는 int x, double y, int z로 총 세개이지만 y의 값만 return했기 때문에
		// y값인 2만 출력된다.
	}

}
