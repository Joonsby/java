package com.jslee.frame;

import java.awt.FileDialog;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileDialogExam extends JFrame{
	FileDialog load = new FileDialog(this,"������");
	FileDialog save = new FileDialog(this,"������",FileDialog.SAVE); // �� ���� ��ȭ ���ڴ� ���� ���(FileDialog.SAVE)�� �����˴ϴ�.
	JFileChooser jf = new JFileChooser();
	
	public FileDialogExam() {
		super("FileDialogExam");
//		load.setVisible(true); // ���� ��ȭ ���ڸ� ȭ�鿡 ǥ���մϴ�. �ü������ �ٸ��� ���´�.
//		save.setVisible(true); // ���� ���� ������ ���� ��ȭ ���ڸ� ȭ�鿡 ǥ���մϴ�. �ü������ �ٸ��� ���´�.
//		jf.showOpenDialog(this); // ���� ���� ��ȭ ���ڸ� ���� ������ �����ϵ��� �մϴ�. ��� �ü������ �Ȱ��� ȭ���� ���´�.
//		jf.showSaveDialog(this); // ���� ���� ��ȭ ���ڸ� ���� ������ �����ϵ��� �մϴ�. ��� �ü������ �Ȱ��� ȭ���� ���´�.
		
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialogExam();
	}

}
