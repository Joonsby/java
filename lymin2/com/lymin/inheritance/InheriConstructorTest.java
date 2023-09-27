package com.lymin.inheritance;

public class InheriConstructorTest {
	public static void main(String[] args) {
		Boy boy = new Boy("Bob");

		System.out.println("------------------------------------------");
		Boy boyTwo = new Boy("MinSu", 1);
		System.out.println("boyTwo name value is [" + boyTwo.name + "]");
		System.out.println("boyTwo idNum value is [" + boyTwo.idNum + "]");
	}

}
