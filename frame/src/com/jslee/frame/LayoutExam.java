package com.jslee.frame;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutExam {	
	JFrame f = new JFrame();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	public LayoutExam() {
		f.setLayout(new BorderLayout(10,30));
		
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH); // borderLayout�� ��ġ�� ǥ���ϴ� ����� �ΰ����ε� north�� west�� ǥ���� ����� center, south, east�� ǥ���� �ΰ��� ����� �ִ�.
		f.add(btn3,"Center"); // ��ġ�� ��ġ�� �Ѱ��� ���̰� �ȴ�. ���� �� �����ǿ� �ϳ��ۿ� ������ �� �ۿ� ����.
		f.add(btn4,"Center");
		f.add(btn5,"East");
		f.setSize(500,400);
		f.setVisible(true);
		// f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutExam();
	}

}
