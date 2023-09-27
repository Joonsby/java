package com.jslee.frame;

import java.awt.FileDialog;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileDialogExam extends JFrame{
	FileDialog load = new FileDialog(this,"열기모드");
	FileDialog save = new FileDialog(this,"저장모드",FileDialog.SAVE); // 이 파일 대화 상자는 저장 모드(FileDialog.SAVE)로 설정됩니다.
	JFileChooser jf = new JFileChooser();
	
	public FileDialogExam() {
		super("FileDialogExam");
//		load.setVisible(true); // 파일 대화 상자를 화면에 표시합니다. 운영체제마다 다르게 나온다.
//		save.setVisible(true); // 저장 모드로 설정된 파일 대화 상자를 화면에 표시합니다. 운영체제마다 다르게 나온다.
//		jf.showOpenDialog(this); // 파일 선택 대화 상자를 열어 파일을 선택하도록 합니다. 모든 운영체제에서 똑같은 화면이 나온다.
//		jf.showSaveDialog(this); // 파일 선택 대화 상자를 열어 파일을 저장하도록 합니다. 모든 운영체제에서 똑같은 화면이 나온다.
		
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialogExam();
	}

}
