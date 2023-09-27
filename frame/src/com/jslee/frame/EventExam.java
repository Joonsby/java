package com.jslee.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExam extends Frame implements ActionListener, WindowListener{

	JButton btn1 = new JButton("click1");
	JButton btn2 = new JButton("click2");

	public EventExam() {
		super("EventExam"); // ���� "EventExam" �Է�
		setLayout(new FlowLayout()); // new FlowLayout ����

		add(btn1);
		add(btn2);
		setSize(400, 300);
		setVisible(true);

		btn1.addActionListener(this); // �Ѱ��ִ� ��ü�� btn1�̱� ������ ����� �ǹ��� this�� �Ű������� �Է������ �Ѵ�.
		btn2.addActionListener(this); // btn2�� Ŭ���ϸ� actionPerformed�޼ҵ带 ȣ���Ѵ�.
		addWindowListener(this); // Frame�� WindowListener�� �߰��Ѵ�.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // �Ű����� �ȿ� �ִ� e�� ���� �������� �� btn1�϶��� hello world�� ����Ѵ�.
			System.out.println("hello world");
		} else if (e.getSource() == btn2){ // �Ű����� �ȿ� �ִ� e�� ���� �������� �� btn2�϶��� bye�� ����Ѵ�.
			System.out.println("bye");
		}
	}	
	
	// window �������̽��� �޼ҵ带 implement�߱� ������ 7���� �޼ҵ带 ��� ������ �ؾ��Ѵ�. ������ ����. ������ �� ������ �ؾ��Ѵ�.

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); // �����Ѵٴ� ��¹��̴�.
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventExam();
	}

}
