package com.lymin.protectedpackC; //��Ű�� �� Ȯ��

import com.lymin.protectedpackA.ProtectedA;

public class ProtectedC {
public String name;
	
	public void protectedMethod() {
		ProtectedA protectedA = new ProtectedA();
//		protectedA.name = "Pro"; // ���� �Ұ�
//		protectedA.protectedMethod(); // ���� �Ұ�.
	}

}
