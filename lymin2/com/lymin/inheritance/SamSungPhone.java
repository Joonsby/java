package com.lymin.inheritance;

public class SamSungPhone extends SmartPhone {

	public SamSungPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void quckPowerOn() { // 삼성의 신기능 입니다.
		System.out.println("SamSung quick PowerOn");
	}

	@Override
	public void bootingLogo() {
		// TODO Auto-generated method stub
		System.out.println("SamSung Logo is Visible....");
		
	}

}
