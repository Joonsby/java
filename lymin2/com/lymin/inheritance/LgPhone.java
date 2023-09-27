package com.lymin.inheritance;

public class LgPhone extends SmartPhone {

	public LgPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void quckPowerOff() { // LG폰의 신기능 입니다.
		System.out.println("LG quick PowerOff");
	}

	@Override // 재정의(오버라이드 입니다.
	public void bootingLogo() { 
		// TODO Auto-generated method stub
		System.out.println("LG Logo is Visible....");
				
	}

}
