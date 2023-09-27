package com.lymin.inheritance;

public class Tiger extends Animal {
	String name = "Leo";

	void attack() {
		System.out.println("[Child] Tiger is attack");
	}

	void slowWalk() {
		System.out.println("----------Tiger Slow walk start------");
		walk(); // 부모의 메서드를 사용 할 수 있습니다.
		System.out.println("----------Tiger Slow walk end------");
	}

}
