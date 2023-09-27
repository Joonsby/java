package com.jslee.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Calculator4 {
	
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JPanel jpanel2 = new JPanel();	
	
	Color color = new Color(255,0,0);	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton();
	JButton btn8 = new JButton("숫자생성");

	public Calculator4() {
		jframe.setSize(500, 500);
		jframe.setVisible(true);
		jframe.setLayout(new GridLayout(2,1));
		jframe.add(jpanel);
		jpanel.setLayout(new GridLayout(2,1));
			
		jpanel.add(btn1);		
		jpanel.add(btn2);
		jpanel.add(btn3);
		jpanel.add(btn4);
		jpanel.add(btn5);
		jpanel.add(btn6);
		
		btn1.setBackground(color.black);
		btn1.setForeground(color.white);
		
		btn2.setBackground(color.black);
		btn2.setForeground(color.white);
		
		btn3.setBackground(color.black);
		btn3.setForeground(color.white);
		
		btn3.setBackground(color.black);
		btn3.setForeground(color.white);
		
		btn4.setBackground(color.black);
		btn4.setForeground(color.white);
		
		btn5.setBackground(color.black);
		btn5.setForeground(color.white);
		
		btn6.setBackground(color.black);
		btn6.setForeground(color.white);
		
		btn7.setBackground(color.yellow);
		
		btn8.setBackground(color.gray);
		btn8.setForeground(color.blue);
		
		jframe.add(jpanel2);
		jpanel2.setLayout(new GridLayout(1,2));
		jpanel2.add(btn7);
		jpanel2.add(btn8);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator4();
	}

}
