package com.lymin.access;

public class MyPhoneInfoTest {
	public static void main(String[] args) {
		MyPhoneInfo myPhoneInfo = new MyPhoneInfo();
		
//		myPhoneInfo.phoneNum ="00022223333";
//		myPhoneInfo.pw = "3333";
		myPhoneInfo.nickName = "happyGirl";
		
		System.out.println("myPhoneInfo.nickName value is ["+myPhoneInfo.nickName+"]");
		myPhoneInfo.callPhone();
//		myPhoneInfo.pwModify();
	}
}
