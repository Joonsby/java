package com.jslee.abstract01;

// 추상 클래스는 객체를 만들어낼 수 없다. -> 생성 자체가 아예 불가능

abstract class ShapeExam { // abstract class 생성 -> new 사용 X
	abstract void draw(); // abstract 메소드 생성 -> 기능 없음
}

class PointExam extends ShapeExam { // ShapeExam 상속 받음
	PointExam() {
	} // 생성자 생성

	void draw() { // draw 메소드 재정의 (Overriding)
		System.out.println("+");
	}
}

class RectExam extends ShapeExam { // ShapeExam 상속 받음
	private int width;
	private int height;
	// int width,height는 class 안에서만 사용가능

	RectExam(int width, int height) { // 생성자
		this.width = width; // 클래스 내의 width
		this.height = height; // 클래스 내의 height
	}

	void draw() { // 메소드 재할당
		for (int i = 1; i <= height; i++) { // height에 입력받은 숫자만큼 반복
			for (int j = 1; j <= width; j++) { // width에 입력받은 숫자만큼 반복
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Shape Ex a = new ShapeExam(); -> 객체를 생성하면 오류가 생긴다. 그러나 객체 배열을 생성하는 것은 오류가 생기지
		// 않는다.
		ShapeExam[] a = new ShapeExam[2]; // 갯수가 2개인 객체 배열 생성 -> 객체를 생성한 것이 아닌 배열을 생성 했기 때문에 오류가 생기지 않는다.
		a[0] = new PointExam(); // ShapeExam의 0번째 배열에 PointExam 객체 생성
		a[1] = new RectExam(4, 3); // ShapeExam의 1번째 배열에 RecExam 객체 생성

		for (ShapeExam s : a) { // 배열의 갯수만큼 반복
			s.draw(); // a[0].draw ~~ a[1].draw()
			System.out.println();
		}

	}

}
