package com.lymin.exception;

public class ThrowsTest {
	public static void main(String[] args) {
		ThrowsClass throwsClass = new ThrowsClass();
		try {
			throwsClass.findClass();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("==========class not find.==========");
		}
	}
	

}
