package com.lymin.inheritance;

public class TigerInheriTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.color = "white"; // 부모로 접근하여 변경함.
		tiger.walk();
		tiger.eat();
		tiger.attack();
		System.out.println("Tiger color is [" + tiger.color + "]");
		tiger.slowWalk();

		Mouse mouse = new Mouse();
		mouse.color = "black";
		mouse.walk();
		mouse.eat();
		System.out.println("Mouse color is [" + mouse.color + "]");
		System.out.println("Mouse color is [" + mouse.name + "]");
		mouse.runAway();
	}
}
