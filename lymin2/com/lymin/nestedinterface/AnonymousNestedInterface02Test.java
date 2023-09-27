package com.lymin.nestedinterface;

public class AnonymousNestedInterface02Test {
	public static void main(String[] args) {
		RemoConDetail remoConDetail = new RemoConDetail();

		remoConDetail.devicePowerOff(new RemoConExTwo() {

			@Override
			public void devicePowerOff() {
				// TODO Auto-generated method stub
				System.out.println("SmartPhone device is Power Off");

			}
		});
	}

}
