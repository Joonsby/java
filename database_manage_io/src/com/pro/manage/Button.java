package com.pro.manage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Button{

	public static void main(String[] args) {
		JFrame frame = new JFrame("회원가입");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		JPanel titlePanel = new JPanel();
		frame.add(titlePanel, BorderLayout.SOUTH);
		JLabel label = new JLabel("성적 관리");
		titlePanel.add(label);
		JButton loginBtn = new JButton("로그인");
		JButton signUpBtn = new JButton("회원 가입");		
		JPanel btnPanel = new JPanel();
		frame.add(btnPanel, BorderLayout.SOUTH);
		btnPanel.add(loginBtn);
		btnPanel.add(signUpBtn);		
	}
}
