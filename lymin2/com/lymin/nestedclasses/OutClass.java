package com.lymin.nestedclasses;

public class OutClass {

	OutClass() {
		System.out.println("OutClasses is Constructor");
	}

	// 인스턴스 멤버 클래스 입니다.
	class NestedClass01 {
		int nId = 0;

		NestedClass01() {
			System.out.println("NestedClass01 Constructor");
		}

		void nestedClass01Method() {
			System.out.println("NestedClass01 id value is " + this.nId);
			System.out.println("nestedClass01Method call...");
		}
	}

	// static 멤버 클래스
	static class StaticClass01 {
		int sId = 1;
		static int nameId = 100;

		StaticClass01() {
			System.out.println("StaticClass01 Constructor");
		}

		void staticNestedClassMethod() {
			System.out.println("staticNestedClassMethod sId value is " + sId);
			System.out.println("staticNestedClassMethod call...");
		}

		static void staticNestedClassStaticMethod() {
			System.out.println("staticNestedClassStaticMethod nameId value is " + nameId);
			System.out.println("staticNestedClassStaticMethod call...");
		}
	}
	
	//실습 인스턴스 멤버 class
	class NestedClassTwo {
//		static int nameId;
//		static void nestedClassTwoMethod() {
//			System.out.println("nestedClassTwoMethod called");
//		}
		int nameId;
		void nestedClassTwoMethod() {
			System.out.println("nestedClassTwoMethod nameId value is " + this.nameId);
			System.out.println("nestedClassTwoMethod called");
		}
	}

}
