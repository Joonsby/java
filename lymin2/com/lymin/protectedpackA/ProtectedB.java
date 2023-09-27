package com.lymin.protectedpackA; //패키지 명 확인

public class ProtectedB {
public String name;
	
	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
		protectedA.name = "Pro"; // 접근 가능
		protectedA.protectedMethod(); // 접근 가능.
	}

}
