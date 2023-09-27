package com.jslee.abstract01;

// �߻� Ŭ������ ��ü�� ���� �� ����. -> ���� ��ü�� �ƿ� �Ұ���

abstract class ShapeExam { // abstract class ���� -> new ��� X
	abstract void draw(); // abstract �޼ҵ� ���� -> ��� ����
}

class PointExam extends ShapeExam { // ShapeExam ��� ����
	PointExam() {
	} // ������ ����

	void draw() { // draw �޼ҵ� ������ (Overriding)
		System.out.println("+");
	}
}

class RectExam extends ShapeExam { // ShapeExam ��� ����
	private int width;
	private int height;
	// int width,height�� class �ȿ����� ��밡��

	RectExam(int width, int height) { // ������
		this.width = width; // Ŭ���� ���� width
		this.height = height; // Ŭ���� ���� height
	}

	void draw() { // �޼ҵ� ���Ҵ�
		for (int i = 1; i <= height; i++) { // height�� �Է¹��� ���ڸ�ŭ �ݺ�
			for (int j = 1; j <= width; j++) { // width�� �Է¹��� ���ڸ�ŭ �ݺ�
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Shape Ex a = new ShapeExam(); -> ��ü�� �����ϸ� ������ �����. �׷��� ��ü �迭�� �����ϴ� ���� ������ ������
		// �ʴ´�.
		ShapeExam[] a = new ShapeExam[2]; // ������ 2���� ��ü �迭 ���� -> ��ü�� ������ ���� �ƴ� �迭�� ���� �߱� ������ ������ ������ �ʴ´�.
		a[0] = new PointExam(); // ShapeExam�� 0��° �迭�� PointExam ��ü ����
		a[1] = new RectExam(4, 3); // ShapeExam�� 1��° �迭�� RecExam ��ü ����

		for (ShapeExam s : a) { // �迭�� ������ŭ �ݺ�
			s.draw(); // a[0].draw ~~ a[1].draw()
			System.out.println();
		}

	}

}
