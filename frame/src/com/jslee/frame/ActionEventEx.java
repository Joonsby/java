package com.jslee.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionEventEx extends JFrame {
	Button b1, b2, b3;

	public ActionEventEx(){ // 생성자
		setLayout(new FlowLayout()); // new FlowLayout 레이아웃 세팅
		ActionListener wa = new ActionListener() { // ActionListener 객체 생성
			public void actionPerformed(ActionEvent e) { // actionPerformed 메소드 생성 
				// 이것은 ActionListener 인터페이스의 actionPerformed 메소드의 구현입니다. 액션 이벤트가 발생했을 때 호출됩니다.
				if(e.getActionCommand().equals("Enable")) { // 액션 문자열의 명령 문자열이 "Enable"과 일치하는지 확인하고 참일시 실행한다.
					b1.setEnabled(false); // b1버튼 비활성화
					b2.setEnabled(true); // b2 버튼 활성화
					b1.setForeground(Color.red); // b1버튼의 전경색을 빨간색으로 칠한다.
				} else if(e.getActionCommand().equals("Disable")) { // 액션 이벤트의 명령 문자열이 "Disable"와 일치하는지 확인한다.
					b1.setEnabled(true); // b1버튼 활성화
					b2.setEnabled(false); // b2버튼 비활성화
					b3.setForeground(Color.blue); // b3버튼의 전경색을 파란색으로 칠한다.
				}
			}			
		};
		b1 = new Button("Enable");
		b2 = new Button("Disable");
		b2.setEnabled(false); // b2버튼은 초기에 	비활성화 되어 있는 상태이다.
		b3 = new Button("Tester");
		b1.addActionListener(wa);
		b2.addActionListener(wa);
		// 이 두 줄은 b1과 b2 버튼에 wa 객체를 액션 리스너로 추가한다.
		// 즉, 버튼 클릭과 같은 액션 이벤트가 발생했을 때 wa 객체의 actionPerformed 메소드가 호출된다.
		add(b1);
		add(b2);
		add(b3);
		// 이 세 줄은 b1, b2, b3 버튼을 ActionEventEx 프레임에 추가한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionEventEx f = new ActionEventEx();
		f.pack();
		f.setVisible(true);
	}

}
