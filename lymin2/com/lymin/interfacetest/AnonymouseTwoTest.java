package com.lymin.interfacetest;

public class AnonymouseTwoTest {
	public static void main(String[] args) {
		RemoCon remoCon = new RemoCon() {
			
			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("Exe----SetOn");
				
			}
			
			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("Exe----SetOff");
				
			}
		};
		
		remoCon.setOn();
		remoCon.setOff();
		
	}

}
