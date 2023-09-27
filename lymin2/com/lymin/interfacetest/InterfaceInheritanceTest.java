package com.lymin.interfacetest;

public class InterfaceInheritanceTest {
	public static void main(String[] args) {
		InputDeviceImpl inputDeviceImpl = new InputDeviceImpl(); // 상세 구현된 클래스를 생성
		
		PhysicalButton physicalButton = inputDeviceImpl; // 인터페이스에 상세구현된 instance를 넣습니다.
		physicalButton.keyPressed(); // 자신의 class에 정의된 추상 메소드만 호출 가능
		
		ScreenTouch screenTouch = inputDeviceImpl; // 인터페이스에 상세구현된 instance를 넣습니다.
		screenTouch.onTouch(); // 자신의 class에 정의된 추상 메소드만 호출 가능
		
		System.out.println("====================================");
		
		InputDevice inputDevice = inputDeviceImpl; // 다중상속한 InputDevice에 상세 구현된 클래스를 넣습니다.
		//////////아래, 상속 받은 두개의 메소드와 자신의 추상 메소드 모두 호출 가능////////
		inputDevice.keyPressed(); 
		inputDevice.onTouch();
		inputDevice.alertError();
		
		inputDevice.onSound(); // 새로 추가된 인터페이스의 동작을 확인 합니다.
		
	}

}
