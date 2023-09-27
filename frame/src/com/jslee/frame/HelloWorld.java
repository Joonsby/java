package com.jslee.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

// awt&swing = java�� ���ؼ� ȭ���� ���� / GUI��� ǥ���Ѵ�.(Graphic User InterFace)
// ȭ�鿡�� container component layout �̷��� �������� �ִ�.
// 1.container�� component���� �÷��� â�̴�.
// 2.component�� ���������� ȭ�鱸���� ����� ����̴�. ex) button, textfield, checkbox
// 3.layoutManager�� container ���� component�� �ø��� �ڸ��� ��ġ�ϴ� ����̴�.
// J�� ������ swing�̶�� frame�ȿ� ���Եȴٴ� ���̴�.

public class HelloWorld {	
	void FrameExam() {
		JFrame jframe = new JFrame("Hello"); // Jframe class�� ����ϱ� ���� Jframe ��ü�� �����Ѵ�. -> container�� ������ ���̴�.
		// �Ű����� �ȿ� �� ���� title�̴�.
		JButton jbutton = new JButton(); // JButton class�� ����ϱ� ���� JButton ��ü�� �����Ѵ�. -> component�� ������ ���̴�.
		jframe.add(jbutton); // jframe�� jbutton�� �߰��Ѵ�.
		jframe.setVisible(true); // jframe�� ���̵��� �Ѵ�
		jframe.setSize(1300, 800); // jframe�� 1300*800 ������� �����Ѵ�.
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld run = new HelloWorld();
		run.FrameExam();
	}

}
