package com.lymin.condition;

public class SwitchChar02Test {
	public static void main(String[] args) {

		char alphabet =  'A';

		switch (alphabet) {
		case 'A':
		case 'B':
			System.out.println("alphabet is A or B");
			break;
		case 'C':
			System.out.println("alphabet is C");
			break;
		default:
			System.out.println("alphabet is D~Z");
			break;
		}

	}

}
