package com.lymin.interfacetest;

public class InputDeviceImpl implements InputDevice {

	@Override
	public void keyPressed() {
		// TODO Auto-generated method stub
		System.out.println("PhysicalButton keyPressed");

	}

	@Override
	public void onTouch() {
		// TODO Auto-generated method stub
		System.out.println("ScreenTouch keyPressed");

	}

	@Override
	public void alertError() {
		// TODO Auto-generated method stub
		System.out.println("InputDevice is Error Code: 0001");

	}

	@Override
	public void onSound() { // 새로 상세 구현 했습니다.
		// TODO Auto-generated method stub
		System.out.println("EarPhoneSocket OnSound is OK");

	}

}
