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

	String idValue = LogIn.idValue; // LogIn �ȿ� �ִ� LogIn.enteredId�� �ҷ���

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	// �������� Frame ����
	JFrame mainFrame = new JFrame("��������");

	// mainFrame ��ư ����
	JButton inputBtn = new JButton("�����Է�");
	JButton outputBtn = new JButton("�������");
	JButton deleteBtn = new JButton("��������");
	JButton logOutBtn = new JButton("�α׾ƿ�");
	JButton exitBtn = new JButton("����");

	// ���� �Է� ������
	JFrame inputFrame = new JFrame("�����Է�");
	// ���� �Է� �г�
	JPanel inputTitlePanel = new JPanel();
	JPanel inputJavaPanel = new JPanel();
	JPanel inputWebPanel = new JPanel();
	JPanel inputJspPanel = new JPanel();
	// ���� �Է� ��ư
	JPanel inputButtonPanel = new JPanel();
	JButton inputBtnOk = new JButton("Ȯ��");
	// ���� �Է� ��
	JLabel inputLabel = new JLabel("������ �Է��ϼ���.");
	// ���� �Է� �ؽ�Ʈ
	JTextField javaText = new JTextField(10);
	JTextField webText = new JTextField(10);
	JTextField jspText = new JTextField(10);

	void setFrame() {
		// mainFrame �⺻ ����
		mainFrame.setSize(350, 250);
		mainFrame.setVisible(true);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setLayout(new GridLayout(5, 1));

		// mainFrame�� ��ư �߰�
		mainFrame.add(inputBtn);
		mainFrame.add(outputBtn);
		mainFrame.add(deleteBtn);
		mainFrame.add(logOutBtn);
		mainFrame.add(exitBtn);

		// ��ư�� �̺�Ʈ �߰�
		inputBtn.addActionListener(this);
		outputBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		logOutBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		inputBtnOk.addActionListener(this);

		// ���� �Է� Frame
		inputFrame.setLayout(new GridLayout(5, 1));
		inputFrame.setLocationRelativeTo(null);
		inputFrame.setResizable(false);
		inputFrame.add(inputTitlePanel);
		inputFrame.add(inputJavaPanel);
		inputFrame.add(inputWebPanel);
		inputFrame.add(inputJspPanel);
		inputFrame.add(inputButtonPanel);

		// ���� �Է� title�� label �߰�
		inputTitlePanel.add(inputLabel);

		// java ���� �Է�
		inputJavaPanel.add(new JLabel("java ���� : "));
		inputJavaPanel.add(javaText);

		// web ���� �Է�
		inputWebPanel.add(new JLabel("web ���� : "));
		inputWebPanel.add(webText);

		// jsp ���� �Է�
		inputJspPanel.add(new JLabel("jsp ���� : "));
		inputJspPanel.add(jspText);

		// ���� �Է� Ȯ�� ��ư
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

	// ���� �Է� �޼ҵ�
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
				JOptionPane.showMessageDialog(null, "������ 0 ~ 100������ ���� �߿��� �Է����ּ���.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else if (web.length() < 0 || web.length() > 100) {
				JOptionPane.showMessageDialog(null, "������ 0 ~ 100������ ���� �߿��� �Է����ּ���.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else if (jsp.length() < 0 || jsp.length() > 100) {
				JOptionPane.showMessageDialog(null, "������ 0 ~ 100������ ���� �߿��� �Է����ּ���.");
				inputFrame.setVisible(true);
				outputBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
			} else {
				deleteBtn.setEnabled(true);
				JOptionPane.showMessageDialog(null, "������ ���������� �ԷµǾ����ϴ�.");
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

	// ���� ��� �޼ҵ�
	void outputScore() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score where id ='" + idValue + "';");
			if (resultSet.next()) {
				JOptionPane.showMessageDialog(null,
						idValue + "���� �����Դϴ�. \n java ������ [ " + resultSet.getInt("java") + " ] �� �Դϴ�.\n" + " web ������ [ "
								+ resultSet.getInt("web") + " ] �� �Դϴ�.\n" + " jsp ������ [ " + resultSet.getInt("jsp")
								+ " ] �� �Դϴ�.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
				System.out.println(e + " => �ݱ� ����");
			}
		}
	}

	// ���� ���� �޼ҵ�
	void deleteScore() {
		JOptionPane.showMessageDialog(null, "������ �����Ǿ����ϴ�.");
		// ���� ��� ��ư ��Ȱ��ȭ
		outputBtn.setEnabled(false);
		// ���� ���� ��ư ��Ȱ��ȭ
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
		int logout = JOptionPane.showConfirmDialog(null, "�α׾ƿ� �Ͻðڽ��ϱ�?", "�α� �ƿ�", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (logout == JOptionPane.YES_OPTION) {
			mainFrame.setVisible(false);
			new Home();
		}
	}

	void exit() {
		int exit = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (exit == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == inputBtn) { // ���� �Է� ��ư
			inputFrame.setSize(400, 300);
			inputFrame.setVisible(true);
		} else if (e.getSource() == outputBtn) { // ���� ��� ��ư
			outputScore();
		} else if (e.getSource() == deleteBtn) { // ���� ���� ��ư
			deleteScore();
		} else if (e.getSource() == logOutBtn) { // �α� �ƿ� ��ư
			logOut();
		} else if (e.getSource() == exitBtn) { // ���� ��ư
			exit();
		} else if (e.getSource() == inputBtnOk) { // ���� �Է� Ȯ�� ��ư
			inputScore();
		}
	}
}
