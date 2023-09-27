package com.lymin.nestedclasses;

import com.lymin.nestedclasses.OutClass.StaticClass01;

public class NestedClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
				
		OutClass.NestedClass01 nestedClass01 = outClass.new NestedClass01(); 
		// 인스턴스 멤머 클래스으므로 .으로 접근하고 new로 생성합니다. (이유는 안쪽 클래스라는 것을 표시 해 줘야 하기 때문입니다.)
		nestedClass01.nId = 1;
		nestedClass01.nestedClass01Method();
		
		
		System.out.println("---------------------------------");
		/////////////////////////////////////////////////////////////////////
		
		OutClass.StaticClass01 staticClass01 = new OutClass.StaticClass01();
		staticClass01.sId = 2;
		staticClass01.staticNestedClassMethod();
		
		OutClass.StaticClass01.nameId = 90;
		OutClass.StaticClass01.staticNestedClassStaticMethod();
		
		System.out.println("---------------------------------");
		
		OutClass.NestedClassTwo nestedClassTwo = outClass.new NestedClassTwo();
		nestedClassTwo.nameId = 3;
		nestedClassTwo.nestedClassTwoMethod();
		
	}

}
