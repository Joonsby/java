package com.jslee.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator2 {	
	JFrame f = new JFrame();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JPanel jf = new JPanel(); // container�� ������ �ƴ����� ���� ���̾��̴�.
	JPanel jf2 = new JPanel();
	
	public Calculator2() {
		f.setLayout(new FlowLayout());
		
		jf.setLayout(new FlowLayout());
		jf.add(btn1); // panel���� component�� add�� �����ϴ�. panel�� container�� �ƴϴ�. panel�� ������ component���� �����ִ� ������ �ϴ� ���̴�.
		jf.add(btn2); // panel�� visible�̳� size�� �ִ� ���� �Ұ��� ������ layout�� �ִ� ���� �����ϴ�.
		
		jf2.setLayout(new BorderLayout());
		jf2.add(btn3,"10,20"); // �ι�° panel�� ��ư �߰�
		jf2.add(btn4,"20,30");
		jf2.add(btn5,"30,40");
		
		f.add(jf);	
		f.add(jf2);
		f.setSize(1500, 800);
		f.setVisible(true);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator2();
	}
	
	

}
