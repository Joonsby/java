package com.lymin.classes;

public class MethodTest {
	public static void main(String[] args) {
//		Calculator calculator = new Calculator();
//		
//		System.out.println("calculator.plus(1,2) value is ["+calculator.plus(1,2)+"]");
//		System.out.println("calculator.minus(2, 1) value is ["+calculator.minus(2, 1)+"]");
//		System.out.println("calculator.getName() value is ["+calculator.getName()+"]");
//		System.out.println("calculator.isBateryEmpty() value is ["+calculator.isBateryEmpty()+"]");
//		calculator.setFactoryInit();
		
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.goOnOpen();
		refrigerator.goOnClose();
		System.out.println("Refrigerator.isDoorOpen value is ["+refrigerator.isDoorOpen()+"]");
		refrigerator.runFreeze();
		System.out.println("Refrigerator.getModelName() value is ["+refrigerator.getModelName()+"]");
		System.out.println("Refrigerator.getTemperature() value is ["+refrigerator.getTemperature()+"]");
		
	}

}
