package com.lymin.nestedclasses;

public class OutClassExtend {

	OutClassExtend() {
		System.out.println("OutClassExtend is Constructor");
	}

	void OutClassExtendMethod() { // Method
		// 로컬 클래스
		class LocalClass {
			int lid = 0;

			LocalClass() {
				System.out.println("LocalClass is Constructor");
			}

			void localMethod() {
				System.out.println("LocalClass lid value is " + this.lid);
				System.out.println("localMethod is OK");
			}

		}
		LocalClass localClass = new LocalClass();
		localClass.lid = 10;
		localClass.localMethod();

	}

}
