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
		f.add(btn2, BorderLayout.SOUTH); // borderLayout의 위치를 표현하는 방법은 두가지인데 north와 west를 표현한 방법과 center, south, east를 표현한 두가지 방법이 있다.
		f.add(btn3,"Center"); // 위치가 겹치면 한곳만 보이게 된다. 따라서 한 포지션에 하나밖에 존재할 수 밖에 없다.
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
