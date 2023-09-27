package com.pro.manage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogIn extends WindowAdapter implements ActionListener {
	// package내에 있는 전체 클래스에서 ID값을 사용하기 위해 enterId를 static으로 선언
	public static String idValue;

	JFrame logInPage = new JFrame("로그인");
	JLabel logInText = new JLabel("로그인", JLabel.CENTER);

	JTextField id = new JTextField(10);
	JPasswordField pw = new JPasswordField(10);

	JButton login = new JButton("로그인");
	JButton cancel = new JButton("취소");

	void setFrame() {
	    logInPage.addWindowListener(new SignUp());

	    JPanel mainPanel = new JPanel(new BorderLayout());

	    JPanel formPanel = new JPanel(new BorderLayout());
	    JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    JPanel pwPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	    JLabel idLabel = new JLabel("ID : ");
	    JLabel pwLabel = new JLabel("PW : ");

	    idPanel.add(idLabel);
	    idPanel.add(id);

	    pwPanel.add(pwLabel);
	    pwPanel.add(pw);

	    formPanel.add(idPanel, BorderLayout.NORTH);
	    formPanel.add(pwPanel, BorderLayout.CENTER);

	    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    btnPanel.add(login);
	    btnPanel.add(cancel);

	    mainPanel.add(logInText, BorderLayout.NORTH);
	    mainPanel.add(formPanel, BorderLayout.CENTER);
	    mainPanel.add(btnPanel, BorderLayout.SOUTH);

	    logInPage.add(mainPanel);

	    logInPage.setSize(300, 200);
	    logInPage.setVisible(true);
	    logInPage.setLocationRelativeTo(null);
	    logInPage.setResizable(false);

	    login.addActionListener(this);
	    cancel.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(login)) {
			inputInfo();
		} else if (e.getSource().equals(cancel)) {
			new Home();
			logInPage.setVisible(false);
		}
	};

	void inputInfo() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		// 입력받은 아이디 값과 비밀번호를 회원정보 클래스에 전달
		String enterId = id.getText();
		String enterPw = new String(pw.getPassword());
		idValue = enterId; // static 변수에 입력받은 id값을 대입
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userinfo where id = '" + idValue + "';");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			if (resultSet.next()) {
				if (enterId.equals("Admin") && enterPw.equals("12345678")) {
					JOptionPane.showMessageDialog(null, "관리자 모드로 전환합니다.");
					logInPage.setVisible(false);
					Admin admin = new Admin();
					admin.mainFrame();
				} else if (enterId.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
				} else if (enterPw.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
				} else if (!resultSet.getString("id").equals(enterId) || !resultSet.getString("pw").equals(enterPw)) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 잘못 입력되었습니다.");
				} else if (resultSet.getString("id").equals(enterId) && resultSet.getString("pw").equals(enterPw)) {
					JOptionPane.showMessageDialog(null, "로그인이 완료되었습니다.");
					logInPage.setVisible(false);
					// 로그인 성공시 성적관리 메소드 호출
					Manage man = new Manage();
					man.setFrame();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
		logInPage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 기본 닫기 작업 무시
		Home home = new Home();
		home.homePage.setVisible(true);
	}
}
