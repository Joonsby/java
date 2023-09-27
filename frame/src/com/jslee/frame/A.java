package com.jslee.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A {
	void frameExam() {
		JFrame f = new JFrame();
		JButton btn = new JButton();
		f.add(btn);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		A ob = new A();
		ob.frameExam();
	}
}
