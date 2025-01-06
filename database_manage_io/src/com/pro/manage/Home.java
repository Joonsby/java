package com.pro.manage;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Home implements ActionListener {
	
	JFrame homePage = new JFrame("성적관리"); // 홈페이지 JFrame
	JButton signUpBtn = new JButton("회원가입"); // 회원가입 버튼
	JButton logInBtn = new JButton("로그인"); // 로그인 버튼
	JPanel btnP = new JPanel();

	public Home() {
		JLabel homeText = new JLabel("Score Manage", JLabel.CENTER); // 홈페이지 제목
		
		btnP.add(signUpBtn);
		btnP.add(logInBtn);
		
		btnP.setLayout(new FlowLayout());
		homePage.setLayout(new GridLayout(2,1));

		homePage.add(homeText);
		homePage.add(btnP);

		homePage.setSize(300, 200);
		homePage.setVisible(true);
		// frame이 가운데에서 나타남
		homePage.setLocationRelativeTo(null);
		// frame 크기 조정이 안됨
		homePage.setResizable(false);

		signUpBtn.addActionListener(this);
		logInBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == signUpBtn) {
			homePage.setVisible(false);
			SignUp signup = new SignUp();
			signup.setFrame();
		} else {
			homePage.setVisible(false);
			LogIn login = new LogIn();
			login.setFrame();
		}
	}
}
