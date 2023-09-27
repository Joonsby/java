package com.lymin.datatype;

public class CharTest {
	public static void main(String[] args) {
		char ch1 = 'A'; // 문자를 직접 저장 
		char ch2 = 65; // 10진수로 저장
		char ch3 = '\u0041'; // 16진수로 저장..
		
		char ch01 = 'ㄱ';
		char ch02 = 12593;
		char ch03 = '\u3131';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch03);
		
		int uniCode = ch01;
		System.out.println(uniCode);
	}

}
