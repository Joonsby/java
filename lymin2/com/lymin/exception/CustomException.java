package com.lymin.exception;

public class CustomException extends Exception {// ����� ���� Exception�� ������� Exception�� ��� �޽��ϴ�.

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
