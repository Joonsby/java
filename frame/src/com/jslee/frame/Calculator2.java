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
	JPanel jf = new JPanel(); // container와 동격은 아니지만 투명 레이어이다.
	JPanel jf2 = new JPanel();
	
	public Calculator2() {
		f.setLayout(new FlowLayout());
		
		jf.setLayout(new FlowLayout());
		jf.add(btn1); // panel에도 component를 add가 가능하다. panel이 container는 아니다. panel의 역할은 component들을 묶어주는 역할을 하는 것이다.
		jf.add(btn2); // panel에 visible이나 size를 주는 것은 불가능 하지만 layout을 주는 것은 가능하다.
		
		jf2.setLayout(new BorderLayout());
		jf2.add(btn3,"10,20"); // 두번째 panel에 버튼 추가
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
