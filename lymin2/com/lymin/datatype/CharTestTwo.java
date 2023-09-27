package com.lymin.datatype;

public class CharTestTwo {
	public static void main(String[] args) {
		char ch1 = 'a'; // 문자를 직접 저장 
		char ch2 = 97; // 10진수로 저장
		char ch3 = '\u0061'; // 16진수로 저장..
		
		char ch01 = '같';
		char ch02 = 44057;
		char ch03 = '\uAC19';
		
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
