package com.jslee.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionEventEx extends JFrame {
	Button b1, b2, b3;

	public ActionEventEx(){ // ������
		setLayout(new FlowLayout()); // new FlowLayout ���̾ƿ� ����
		ActionListener wa = new ActionListener() { // ActionListener ��ü ����
			public void actionPerformed(ActionEvent e) { // actionPerformed �޼ҵ� ���� 
				// �̰��� ActionListener �������̽��� actionPerformed �޼ҵ��� �����Դϴ�. �׼� �̺�Ʈ�� �߻����� �� ȣ��˴ϴ�.
				if(e.getActionCommand().equals("Enable")) { // �׼� ���ڿ��� ��� ���ڿ��� "Enable"�� ��ġ�ϴ��� Ȯ���ϰ� ���Ͻ� �����Ѵ�.
					b1.setEnabled(false); // b1��ư ��Ȱ��ȭ
					b2.setEnabled(true); // b2 ��ư Ȱ��ȭ
					b1.setForeground(Color.red); // b1��ư�� ������� ���������� ĥ�Ѵ�.
				} else if(e.getActionCommand().equals("Disable")) { // �׼� �̺�Ʈ�� ��� ���ڿ��� "Disable"�� ��ġ�ϴ��� Ȯ���Ѵ�.
					b1.setEnabled(true); // b1��ư Ȱ��ȭ
					b2.setEnabled(false); // b2��ư ��Ȱ��ȭ
					b3.setForeground(Color.blue); // b3��ư�� ������� �Ķ������� ĥ�Ѵ�.
				}
			}			
		};
		b1 = new Button("Enable");
		b2 = new Button("Disable");
		b2.setEnabled(false); // b2��ư�� �ʱ⿡ 	��Ȱ��ȭ �Ǿ� �ִ� �����̴�.
		b3 = new Button("Tester");
		b1.addActionListener(wa);
		b2.addActionListener(wa);
		// �� �� ���� b1�� b2 ��ư�� wa ��ü�� �׼� �����ʷ� �߰��Ѵ�.
		// ��, ��ư Ŭ���� ���� �׼� �̺�Ʈ�� �߻����� �� wa ��ü�� actionPerformed �޼ҵ尡 ȣ��ȴ�.
		add(b1);
		add(b2);
		add(b3);
		// �� �� ���� b1, b2, b3 ��ư�� ActionEventEx �����ӿ� �߰��Ѵ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionEventEx f = new ActionEventEx();
		f.pack();
		f.setVisible(true);
	}

}
