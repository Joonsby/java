package com.lymin.inheritance;

public class AbstractTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone("myPhone");
		
		LgPhone lgPhone = new LgPhone("WING");
		lgPhone.powerOn(); // abstract method »£√‚
		lgPhone.quckPowerOff();
		lgPhone.powerOff(); // abstract method »£≠Ñ
		lgPhone.bootingLogo(); // ªı∑Œ √ﬂ∞°µ» abstract ∏ﬁº“µÂ∏¶ ¿Á¡§¿« «œø© »£√‚«‘.
		
		System.out.println("----------------------");
		SamSungPhone samSungPhone = new SamSungPhone("Galaxy21");
		samSungPhone.powerOn();
		samSungPhone.quckPowerOn();
		samSungPhone.powerOff();
		samSungPhone.bootingLogo();
		
	}

}
