package com.lymin.protectedpackA;

import com.lymin.protectedpackC.ProtectedD;

public class ProtectedTest {
	public static void main(String[] args) {
		ProtectedB protectedB = new ProtectedB();
		protectedB.protectedMethod();
		
		ProtectedD protectedD = new ProtectedD();
		protectedD.protectedMethod();
	}

}
