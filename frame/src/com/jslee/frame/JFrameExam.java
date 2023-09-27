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
		super("JFrameExam"); // 자식의 생성자는 반드시 부모의 생성자를 불러야 한다.
		setLayout(new FlowLayout()); // 다음에 객체를 다시 사용할 일이 없기 때문에 바로 객체를 만들어서 사용한 것이다.
		// FlowLayout : 아무런 layout을 주지 않았을 때 기본적으로 들어가는 layout
//		/*super.*/add(btn);
//		/*super.*/add(btn2);
//		/*super.*/add(btn3);
		/*super.*/setSize(300,200);
		/*super.*/setVisible(true);
		// 부모로부터 상속 받았기 때문에 super가 생략되어 있다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameExam();
	}

}
