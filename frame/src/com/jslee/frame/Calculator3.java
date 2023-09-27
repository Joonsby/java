package com.jslee.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator3 {
	
//	JButton[] jbutton = new JButton[16];
//	
//    for (int i = 0; i < buttons.length; i++) {
//        jbutton[i] = new JButton(String.valueOf(i + 1));
//    }

	
	Color color = new Color(255,0,0);
	
	JFrame j = new JFrame();
	JPanel jf = new JPanel();
	JPanel jf2 = new JPanel();
	JPanel jf3 = new JPanel();
	JPanel jf4 = new JPanel();
	JButton btn1 = new JButton("0.0");
	JButton btn2 = new JButton("+");
	JButton btn3 = new JButton("-");
	JButton btn4 = new JButton("*");
	JButton btn5 = new JButton("/");
	JButton btn6 = new JButton("=");
	JButton btn7 = new JButton("0");
	JButton btn8 = new JButton("1");
	JButton btn9 = new JButton("2");
	JButton btn10 = new JButton("3");
	JButton btn11 = new JButton("4");
	JButton btn12 = new JButton("5");
	JButton btn13 = new JButton("6");
	JButton btn14 = new JButton("7");
	JButton btn15 = new JButton("8");
	JButton btn16 = new JButton("9");
	
	public Calculator3(){
		j.setLayout(new GridLayout(4,1));
		j.setVisible(true); // jframe이 보이도록 한다
		j.setSize(500, 600);
		j.add(jf);
		j.add(jf2);
		j.add(jf3);
		j.add(jf4);
		
		jf.setLayout(new BorderLayout());
		jf.add(btn1);
		btn1.setBackground(color.white);
		
		jf2.setLayout(new GridLayout(1,5));
		jf2.add(btn2);
		jf2.add(btn3);
		jf2.add(btn4);
		jf2.add(btn5);
		jf2.add(btn6);
		btn2.setBackground(color.yellow);
		btn3.setBackground(color.yellow);
		btn4.setBackground(color.yellow);
		btn5.setBackground(color.yellow);
		btn6.setBackground(color.yellow);
		
		jf3.setLayout(new GridLayout(1,5));
		jf3.add(btn7);
		jf3.add(btn8);
		jf3.add(btn9);
		jf3.add(btn10);
		jf3.add(btn11);
		
		jf4.setLayout(new GridLayout(1,5));		
		jf4.add(btn12);
		jf4.add(btn13);
		jf4.add(btn14);
		jf4.add(btn15);
		jf4.add(btn16);
		btn12.setBackground(color.yellow);
		btn13.setBackground(color.yellow);
		btn14.setBackground(color.yellow);
		btn15.setBackground(color.yellow);
		btn16.setBackground(color.yellow);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator3();
	}

}
