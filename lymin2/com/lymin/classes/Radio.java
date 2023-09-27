package com.lymin.classes;

public class Radio {
	String color = ""; //  필드
	static String name = "SONY ICF-P26"; // 정적 필드
	
	void onRadio() { //  메소드
		System.out.println("Radio is turn on");
	}
	
	static void onQuickRadio() { // 정적(스테틱) 메소드
		System.out.println("Radio is turn onQuick");
	}

}
