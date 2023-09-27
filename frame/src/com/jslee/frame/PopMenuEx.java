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
	MenuItem pm_item1 = new MenuItem("��ü����");
	MenuItem pm_item2 = new MenuItem("�����ϱ�");
	MenuItem pm_item3 = new MenuItem("�߶󳻱�");
	MenuItem pm_item4 = new MenuItem("�ٿ��ֱ�");

	public PopMenuEx() {
		super("�˾� �޴�"); // ���� "�˾� �޴�" �Է�
		pm.addSeparator(); // ���м��� �߰��ϴ� �޼ҵ�
		pm.add(pm_item1);
		pm.add(pm_item2);
		pm.add(pm_item3);
		pm.add(pm_item4);

		add(pm); // �˾� �޴��� �����ӿ� �߰�
		setSize(200, 400);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() { // �� �ڽ��� Ŭ���� (this) �� �͸� ���� Ŭ������ WindowAdapter�� �����Ͽ� WindowListener�� �߰�.

			@Override
			public void windowClosing(WindowEvent e) { // WindowAdapter Ŭ������ windowClosing �޼ҵ带 ������, System.exit�� ���α׷� ����
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		this.addMouseListener(new MouseAdapter() { // �� �ڽ��� Ŭ���� (this) �� �͸� ���� Ŭ������ MouseAdapter�� �����Ͽ� WindowListener�� �߰�.

			@Override
			public void mousePressed(MouseEvent me) { // WindowAdapter Ŭ������ mousePressed �޼ҵ带 ������
				// TODO Auto-generated method stub
				if (me.getButton() == MouseEvent.BUTTON3) {
					pm.show(PopMenuEx.this, me.getX(), me.getY()); // ���콺 ������ ��ư�� ������ �� �˾� �޴��� ������ ��ǥ�� ǥ��.
				}
			}

		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PopMenuEx(); // PopMenuEx ��ü�� �����Ͽ� ���α׷��� ����.
	}

}
