package com.jslee.Interface;

interface Sung_1 { // 인터페이스 Sung_1 생성
	void sethakbun(String hakbun); // sethakbun 메소드 생성
	void setname(String name); // setname 메소드 생성
}

interface Sung_2 { // 인터페이스 Sung_2 생성
	void setjumsu(int jumsu); // setjumsu 메소드 생성
}

interface Sung extends Sung_1, Sung_2 { // 5개의 메소드를 모두 재정의 해야한다.
	void title(); // title 메소드 생성
	void prt_data(); // prt_data 메소드 생성
}

class Sungjuk implements Sung { // Sung 인터페이스를 implement
	String hakbun = " ";
	String name = " ";
	int jumsu = 0;

	public void title() { // title 메소드 재정의
		System.out.println("*** 인터페이스(interface) 사용 ***");
		System.out.println("*** 자바의 성적 출력 ***");
		System.out.println("**학번** **성명** **점수**");
		System.out.println("-----------------------");
	}

	public void sethakbun(String hakbun) { // sethakbun 메소드 재정의
		this.hakbun = hakbun;
	}

	public void setname(String name) { // setname 메소드 재정의
		this.name = name;
	}

	public void setjumsu(int jumsu) { // setjumsu 메소드 재정의
		this.jumsu = jumsu;
	}

	public void prt_data() { // prt_data 메소드 재정의
		System.out.println(hakbun + " " + name + " " + jumsu);
	}
}

public class Interface02 extends Sungjuk {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sungjuk ken = new Sungjuk(); // 객체 생성
		ken.sethakbun("2060001");
		ken.setname("Nam");
		ken.setjumsu(60);
		Sungjuk sung = new Sungjuk();
		sung.sethakbun("2060002");
		sung.setname("Mi");
		sung.setjumsu(80);

		ken.title();
		ken.prt_data();
		sung.prt_data();

	}
}
