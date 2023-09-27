package com.lymin.protectedpackC; //패키지 명 확인

import com.lymin.protectedpackA.ProtectedA; // 다른 package의 import

public class ProtectedD extends ProtectedA {
	public String name;

	public void protectedMethod() {
		super.name = "ProD"; // 상속을 받았으므로 다른 패키지라도 super로 접근 가능
		super.protectedMethod(); // 상속을 받았으므로 다른 패키지라도 super로 접근 가능

	}

}
