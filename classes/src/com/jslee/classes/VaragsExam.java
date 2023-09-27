package com.jslee.classes;

public class VaragsExam {
	void aa(int i) {
		System.out.println("aa 호출됨");
	}

	void bb(int...i) { // ...은 가변인자이다. 어떻게 호출하느냐에 따라서 인자가 변할 수 있다는 뜻이다. type을 바꿀수는 없지만 매개변수의 갯수는 호출에 따라 변할 수 있다.
		// System.out.println();의 매개변수도 ...가변인자로 선언되어 있다.
		System.out.println("\n === bb호출");
		// System.out.println(i); -> error
		// System.out.println(i[]); -> error
		for (int a : i) { // i가 가지고 있는 수만큼 알아서 반복을 할 것이다.
			System.out.println(a + "\t");
		}
	}

	void cc(String...s) {
		System.out.println("\n === cc호출");
		for (String str : s) {
			System.out.println(str + "\t");
		}
	}

	void dd(Object...obj) { // Object는 어떤 것이든 상관없이 뭐든지 다 담을수 있다. Object로 다 만들면 메모리를 maximum으로 담기 때문에 메모리의 낭비가 생길 수 있다.
		System.out.println("dd호출");
		for(Object ob : obj) {
			System.out.println(ob);
		}
	}

	void ee(int i, String...s) {
		System.out.println("ee호출");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaragsExam ve = new VaragsExam();
		ve.aa(3); // ve.aa("java"); -> 괄호안의 매개변수가 int형이기 때문에 에러가 뜬다.
		
		ve.bb();
		ve.bb(1, 2);
		ve.bb(3, 4, 5);
		
		ve.cc("String");
		ve.cc("String1", "String2");
		
		ve.dd();
		ve.dd(3, 2, "hello", "haha");
		ve.dd(2.5, 'a', "hoho", 7);
		
		ve.ee(2);
		ve.ee(3, "a", "b", "c");
	}

}
