package com.lymin.classes;

public class DogFieldTest {
	public static void main(String[] args) {
		Dog dog = new Dog(); // new key로 델리게이션 메모리에 객체 생성. 참조 가능.
		System.out.println("dog.name value is [" + dog.name + "]"); // 실제 참조 후 출력.
		System.out.println("dog.gender value is [" + dog.gender + "]");
		System.out.println("dog.age value is [" + dog.age + "]");
		System.out.println("dog.color value is [" + dog.color + "]");
		System.out.println("dog.kind value is [" + dog.kind + "]");
		System.out.println("dog.character value is [" + dog.character + "]");
	}

}
