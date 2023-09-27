package com.lymin.javaapi;

public class TrimTest {
	public static void main(String[] args) {
		String string = "  Tell me Something!   ";
		String string2 = "Now";
		
		System.out.println(string+string2);
		System.out.println(string.trim()+string2);
	}

}
