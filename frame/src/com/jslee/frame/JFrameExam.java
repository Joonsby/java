package com.jslee.frame;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExam extends JFrame{
	JButton btn = new JButton("Click2");
	JButton btn2 = new JButton("Click2");
	JButton btn3 = new JButton("Click3");
	
	public JFrameExam() {
		super("JFrameExam"); // �ڽ��� �����ڴ� �ݵ�� �θ��� �����ڸ� �ҷ��� �Ѵ�.
		setLayout(new FlowLayout()); // ������ ��ü�� �ٽ� ����� ���� ���� ������ �ٷ� ��ü�� ���� ����� ���̴�.
		// FlowLayout : �ƹ��� layout�� ���� �ʾ��� �� �⺻������ ���� layout
//		/*super.*/add(btn);
//		/*super.*/add(btn2);
//		/*super.*/add(btn3);
		/*super.*/setSize(300,200);
		/*super.*/setVisible(true);
		// �θ�κ��� ��� �޾ұ� ������ super�� �����Ǿ� �ִ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameExam();
	}

}
