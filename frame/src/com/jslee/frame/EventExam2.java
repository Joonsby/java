package com.jslee.frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class EventExam2 extends Frame implements ActionListener{

	JButton btn1 = new JButton("click1");
	JButton btn2 = new JButton("click2");

	public EventExam2() {
		super("EventExam"); // ���� "EventExam" �Է�
		setLayout(new FlowLayout()); // new FlowLayout ����

		add(btn1); //
		add(btn2);
		setSize(400, 300);
		setVisible(true);
		EventExamClass obj = new EventExamClass(); // EventExamClass ��ü�� ����.
		

		btn1.addActionListener(this); // �Ѱ��ִ� ��ü�� btn1�̱� ������ ����� �ǹ��� this�� �Ű������� �Է������ �Ѵ�.
		btn2.addActionListener(this); // btn2�� Ŭ���ϸ� actionPerformed�޼ҵ带 ȣ���Ѵ�.
		this.addWindowListener(obj); // �� Ŭ������ addWindowListenr�� ����Ǹ� EventExamClass�� ����ȴ�.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // �Ű����� �ȿ� �ִ� e�� ���� �������� �� btn1�϶��� hello world�� ����Ѵ�.
			System.out.println("hello world");
		} else { // �Ű����� �ȿ� �ִ� e�� ���� �������� �� btn2�϶��� bye�� ����Ѵ�.
			System.out.println("bye");
		}
	}
	
	class EventExamClass extends WindowAdapter{ // ���ο� Ŭ������ �����ؼ� �������̽��� �޼ҵ带 ������ �� �ʿ� ���� �ϳ��� �޼ҵ常 �����ͼ� ����� �� �ִ�.
		@Override // source�޴����� Override/Implement Method �����ؼ� windowClosing �޼ҵ常 ȣ���ϰ� ������
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		} // WindowAdapter�� ��� �ޱ� ���� ���ο� Ŭ���� ����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventExam2();
	}
	

}
