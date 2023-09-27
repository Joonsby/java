package com.pro.manage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Manage implements ActionListener {

	String idValue = LogIn.idValue; // LogIn 안에 있는 LogIn.enteredId를 불러옴

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	// 성적관리 Frame 생성
	JFrame mainFrame = new JFrame("성적관리");

	// mainFrame 버튼 생성
	JButton inputBtn = new JButton("성적입력");
	JButton outputBtn = new JButton("성적출력");
	JButton deleteBtn = new JButton("성적삭제");
	JButton logOutBtn = new JButton("로그아웃");
	JButton exitBtn = new JButton("종료");

	// 성적 입력 프레임
	JFrame inputFrame = new JFrame("성적입력");
	// 성적 입력 패널
	JPanel inputTitlePanel = new JPanel();
	JPanel inputJavaPanel = new JPanel();
	JPanel inputWebPanel = new JPanel();
	JPanel inputJspPanel = new JPanel();
	// 성적 입력 버튼
	JPanel inputButtonPanel = new JPanel();
	JButton inputBtnOk = new JButton("확인");
	// 성적 입력 라벨
	JLabel inputLabel = new JLabel("성적을 입력하세요.");
	// 성적 입력 텍스트
	JTextField javaText = new JTextField(10);
	JTextField webText = new JTextField(10);
	JTextField jspText = new JTextField(10);

	void setFrame() {
		// mainFrame 기본 설정
		mainFrame.setSize(350, 250);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setLayout(new GridLayout(5, 1));

		// mainFrame에 버튼 추가
		mainFrame.add(inputBtn);
		mainFrame.add(outputBtn);
		mainFrame.add(deleteBtn);
		mainFrame.add(logOutBtn);
		mainFrame.add(exitBtn);

		// 버튼에 이벤트 추가
		inputBtn.addActionListener(this);
		outputBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		logOutBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		inputBtnOk.addActionListener(this);

		// 성적 입력 Frame
		inputFrame.setLayout(new GridLayout(5, 1));
		inputFrame.setLocationRelativeTo(null);
		inputFrame.setResizable(false);
		inputFrame.add(inputTitlePanel);
		inputFrame.add(inputJavaPanel);
		inputFrame.add(inputWebPanel);
		inputFrame.add(inputJspPanel);
		inputFrame.add(inputButtonPanel);

		// 성적 입력 title에 label 추가
		inputTitlePanel.add(inputLabel);

		// java 성적 입력
		inputJavaPanel.add(new JLabel("java 성적 : "));
		inputJavaPanel.add(javaText);

		// web 성적 입력
		inputWebPanel.add(new JLabel("web 성적 : "));
		inputWebPanel.add(webText);

		// jsp 성적 입력
		inputJspPanel.add(new JLabel("jsp 성적 : "));
		inputJspPanel.add(jspText);

		// 성적 입력 확인 버튼
		inputButtonPanel.add(inputBtnOk);

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score where id ='" + idValue + "';");
			if (!resultSet.next()) {
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	// 성적 입력 메소드
	void inputScore() {
		outputBtn.setEnabled(true);
		String java = javaText.getText();
		String web = webText.getText();
		String jsp = jspText.getText();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			statement.executeUpdate("delete from score where id =" + "'" + idValue + "';");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			statement.executeUpdate("insert into score(id,java,web,jsp) values('" + idValue + "'" + "," + java + ","
					+ web + "," + jsp + ");");
			if (java.length() < 0 || java.length() > 100) {
				JOptionPane.showMessageDialog(null, "점수는 0 ~ 100까지의 숫자 중에서 입력해주세요.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else if (web.length() < 0 || web.length() > 100) {
				JOptionPane.showMessageDialog(null, "점수는 0 ~ 100까지의 숫자 중에서 입력해주세요.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else if (jsp.length() < 0 || jsp.length() > 100) {
				JOptionPane.showMessageDialog(null, "점수는 0 ~ 100까지의 숫자 중에서 입력해주세요.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else {
				deleteBtn.setEnabled(true);
				JOptionPane.showMessageDialog(null, "성적이 정상적으로 입력되었습니다.");
				inputFrame.setVisible(false);
				javaText.setText("");
				webText.setText("");
				jspText.setText("");
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	// 성적 출력 메소드
	void outputScore() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score where id ='" + idValue + "';");
			if (resultSet.next()) {
				JOptionPane.showMessageDialog(null,
						idValue + "님의 성적입니다. \n java 성적은 [ " + resultSet.getInt("java") + " ] 점 입니다.\n" + " web 성적은 [ "
								+ resultSet.getInt("web") + " ] 점 입니다.\n" + " jsp 성적은 [ " + resultSet.getInt("jsp")
								+ " ] 점 입니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
				System.out.println(e + " => 닫기 실패");
			}
		}
	}

	// 성적 삭제 메소드
	void deleteScore() {
		JOptionPane.showMessageDialog(null, "성적이 삭제되었습니다.");
		// 성적 출력 버튼 비활성화
		outputBtn.setEnabled(false);
		// 성적 삭제 버튼 비활성화
		deleteBtn.setEnabled(false);
		inputFrame.setVisible(false);
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			statement.executeUpdate("delete from score where id =" + "'" + idValue + "';");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

	void logOut() {
		int logout = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그 아웃", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (logout == JOptionPane.YES_OPTION) {
			mainFrame.setVisible(false);
			new Home();
		}
	}

	void exit() {
		int exit = JOptionPane.showConfirmDialog(null, "종료 하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (exit == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == inputBtn) { // 성적 입력 버튼
			inputFrame.setSize(400, 300);
			inputFrame.setVisible(true);
		} else if (e.getSource() == outputBtn) { // 성적 출력 버튼
			outputScore();
		} else if (e.getSource() == deleteBtn) { // 성적 삭제 버튼
			deleteScore();
		} else if (e.getSource() == logOutBtn) { // 로그 아웃 버튼
			logOut();
		} else if (e.getSource() == exitBtn) { // 종료 버튼
			exit();
		} else if (e.getSource() == inputBtnOk) { // 성적 입력 확인 버튼
			inputScore();
		}
	}
}
