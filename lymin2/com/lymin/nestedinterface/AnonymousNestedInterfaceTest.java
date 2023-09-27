package com.lymin.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn(); // 필드 접근
		anonymous.fieldRemoConEx.setOff(); // 필드 접근
		
		anonymous.method01(); // 로컬 변수에 접근.
		
		anonymous.method02(new RemoConEx() { // 매개변수로 넘기면서 재정의 하는 것입니다. 
			//이 메인 클래스에서 재정의 하고 싶은 경우에 사용 합니다.
			
			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is setOn");
				
			}
			
			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is setOn");
				
			}
		});
		
		
	}
}
