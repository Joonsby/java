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
		super("EventExam"); // 제목에 "EventExam" 입력
		setLayout(new FlowLayout()); // new FlowLayout 세팅

		add(btn1); //
		add(btn2);
		setSize(400, 300);
		setVisible(true);
		EventExamClass obj = new EventExamClass(); // EventExamClass 객체를 생성.
		

		btn1.addActionListener(this); // 넘겨주는 주체가 btn1이기 때문에 나라는 의미의 this를 매개변수에 입력해줘야 한다.
		btn2.addActionListener(this); // btn2에 클릭하면 actionPerformed메소드를 호출한다.
		this.addWindowListener(obj); // 이 클래스에 addWindowListenr가 실행되면 EventExamClass가 실행된다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // 매개변수 안에 있는 e의 값을 가져왔을 때 btn1일때는 hello world를 출력한다.
			System.out.println("hello world");
		} else { // 매개변수 안에 있는 e의 값을 가져왔을 때 btn2일때는 bye를 출력한다.
			System.out.println("bye");
		}
	}
	
	class EventExamClass extends WindowAdapter{ // 새로운 클래스를 생성해서 인터페이스의 메소드를 재정의 할 필요 없이 하나의 메소드만 가져와서 사용할 수 있다.
		@Override // source메뉴에서 Override/Implement Method 선택해서 windowClosing 메소드만 호출하고 재정의
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		} // WindowAdapter를 상속 받기 위해 새로운 클래스 생성
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventExam2();
	}
	

}
