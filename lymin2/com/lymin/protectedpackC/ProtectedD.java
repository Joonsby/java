package com.lymin.protectedpackC; //��Ű�� �� Ȯ��

import com.lymin.protectedpackA.ProtectedA; // �ٸ� package�� import

public class ProtectedD extends ProtectedA {
	public String name;

	public void protectedMethod() {
		super.name = "ProD"; // ����� �޾����Ƿ� �ٸ� ��Ű���� super�� ���� ����
		super.protectedMethod(); // ����� �޾����Ƿ� �ٸ� ��Ű���� super�� ���� ����

	}

}
