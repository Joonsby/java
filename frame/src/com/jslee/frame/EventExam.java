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
		super("EventExam"); // 제목에 "EventExam" 입력
		setLayout(new FlowLayout()); // new FlowLayout 세팅

		add(btn1);
		add(btn2);
		setSize(400, 300);
		setVisible(true);

		btn1.addActionListener(this); // 넘겨주는 주체가 btn1이기 때문에 나라는 의미의 this를 매개변수에 입력해줘야 한다.
		btn2.addActionListener(this); // btn2에 클릭하면 actionPerformed메소드를 호출한다.
		addWindowListener(this); // Frame에 WindowListener를 추가한다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // 매개변수 안에 있는 e의 값을 가져왔을 때 btn1일때는 hello world를 출력한다.
			System.out.println("hello world");
		} else if (e.getSource() == btn2){ // 매개변수 안에 있는 e의 값을 가져왔을 때 btn2일때는 bye를 출력한다.
			System.out.println("bye");
		}
	}	
	
	// window 인터페이스의 메소드를 implement했기 때문에 7개의 메소드를 모두 재정의 해야한다. 선택은 없다. 무조건 다 재정의 해야한다.

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
		System.exit(0); // 종료한다는 출력문이다.
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
