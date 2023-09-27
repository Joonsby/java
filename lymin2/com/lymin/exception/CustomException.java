package com.lymin.exception;

public class CustomException extends Exception {// 사용자 정의 Exception을 만드려면 Exception을 상속 받습니다.

	public CustomException() {
		super();
		System.out.println("CustomException OK");
		// TODO Auto-generated constructor stub
	}

	public CustomException(String arg0) {
		super(arg0);
		System.out.println("CustomException(String arg0) OK");
		// TODO Auto-generated constructor stub
	}
	

}
