package com.lymin.inheritance;

public class Boy extends People {
	public int idNum;
	
	public Boy(String name) {
		super(name); // 부모를 가르킵니다.
		// TODO Auto-generated constructor stub
	}
	
	public Boy(String name, int idNum) { 
		super(name); // 부모 생성자로 생성하고
		// TODO Auto-generated constructor stub
		this.idNum = idNum; // 자신의 필드 변수에 값을 저장한다.
	}

}
