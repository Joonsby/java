package com.jslee.frame;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PopMenuEx extends Frame {
	PopupMenu pm = new PopupMenu();
	MenuItem pm_item1 = new MenuItem("전체선택");
	MenuItem pm_item2 = new MenuItem("복사하기");
	MenuItem pm_item3 = new MenuItem("잘라내기");
	MenuItem pm_item4 = new MenuItem("붙여넣기");

	public PopMenuEx() {
		super("팝업 메뉴"); // 제목에 "팝업 메뉴" 입력
		pm.addSeparator(); // 구분선을 추가하는 메소드
		pm.add(pm_item1);
		pm.add(pm_item2);
		pm.add(pm_item3);
		pm.add(pm_item4);

		add(pm); // 팝업 메뉴를 프레임에 추가
		setSize(200, 400);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() { // 나 자신의 클래스 (this) 에 익명 내부 클래스인 WindowAdapter를 생성하여 WindowListener로 추가.

			@Override
			public void windowClosing(WindowEvent e) { // WindowAdapter 클래스의 windowClosing 메소드를 재정의, System.exit로 프로그램 종료
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		this.addMouseListener(new MouseAdapter() { // 나 자신의 클래스 (this) 에 익명 내부 클래스인 MouseAdapter를 생성하여 WindowListener로 추가.

			@Override
			public void mousePressed(MouseEvent me) { // WindowAdapter 클래스의 mousePressed 메소드를 재정의
				// TODO Auto-generated method stub
				if (me.getButton() == MouseEvent.BUTTON3) {
					pm.show(PopMenuEx.this, me.getX(), me.getY()); // 마우스 오른쪽 버튼을 눌렀을 때 팝업 메뉴를 지정된 좌표에 표시.
				}
			}

		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PopMenuEx(); // PopMenuEx 객체를 생성하여 프로그램을 실행.
	}

}
