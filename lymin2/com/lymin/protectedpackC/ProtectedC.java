package com.lymin.protectedpackC; //패키지 명 확인

import com.lymin.protectedpackA.ProtectedA;

public class ProtectedC {
public String name;
	
	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
//		protectedA.name = "Pro"; // 접근 불가
//		protectedA.protectedMethod(); // 접근 불가.
	}

}
