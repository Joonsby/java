package com.pro.manage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

// name, id, pw, phone, birth, gender, email

class SignUp extends WindowAdapter implements ActionListener {
	// ȸ������ �������� ����
	String userName;
	String userId;
	String userPw;
	String userNewsagency;
	String userPhNum1;
	String userPhNum2;
	String userPhNum3;
	String userBirth;
	String userGender;
	String userFirstEmail;
	String userMiddleEmail;
	String userLastEmail;
	JFrame signUpPage = new JFrame("ȸ������");
	// component ���������� ����
	JLabel signUpText = new JLabel("ȸ������", JLabel.CENTER);
	// ��ư
	JButton join = new JButton("ȸ������");
	JButton cancel = new JButton("���");
	JButton sameIdCheck = new JButton("�ߺ� Ȯ��");
	// �̸�
	JTextField name = new JTextField(5);
	// ���̵�
	JTextField id = new JTextField(10);
	// ��й�ȣ
	JPasswordField pw = new JPasswordField(10);
	// �ڵ��� ��ȣ
	String num[] = new String[] { "SKT", "KT", "LG", "�˶���" };
	// String ������ combobox
	JComboBox<String> newsagency = new JComboBox<String>(num);
	JTextField phNum1 = new JTextField(3);
	JTextField phNum2 = new JTextField(4);
	JTextField phNum3 = new JTextField(4);
	// �������
	JTextField birth = new JTextField(6);
	// ����
	JRadioButton male = new JRadioButton("male");
	JRadioButton female = new JRadioButton("female");
	// �̸���
	JTextField firstEmail = new JTextField(10);
	JLabel middleEmail = new JLabel("@");
	JTextField lastEmail = new JTextField(15);

	// mysql �ʱⰪ ����
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	void setFrame() { // ������ ����
		signUpPage.addWindowListener(new SignUp());
		// ����
		ButtonGroup gen = new ButtonGroup(); // radio�� ��ư �׷�
		male.setSelected(true);
		gen.add(male);
		gen.add(female);

		// panel
		JPanel nameP = new JPanel();
		nameP.add(new JLabel("�� �� : "));
		nameP.add(name);

		JPanel idP = new JPanel();
		idP.add(new JLabel("ID : "));
		idP.add(id);
		idP.add(sameIdCheck);

		JPanel pwP = new JPanel();
		pwP.add(new JLabel("PW : "));
		pwP.add(pw);

		JPanel phP = new JPanel();
		phP.add(new JLabel("����ó : "));
		phP.add(newsagency);
		phP.add(phNum1);
		phP.add(phNum2);
		phP.add(phNum3);

		JPanel birthP = new JPanel();
		birthP.add(new JLabel("������� : "));
		birthP.add(birth);

		JPanel genderP = new JPanel();
		genderP.add(new JLabel("���� : "));
		genderP.add(male);
		genderP.add(female);

		JPanel mailP = new JPanel();
		mailP.add(new JLabel("�̸��� : "));
		mailP.add(firstEmail);
		mailP.add(middleEmail);
		mailP.add(lastEmail);

		JPanel formP = new JPanel();
		formP.setLayout(new GridLayout(7, 1));
		formP.add(nameP);
		formP.add(idP);
		formP.add(pwP);
		formP.add(phP);
		formP.add(birthP);
		formP.add(genderP);
		formP.add(mailP);

		JPanel btnP = new JPanel();
		btnP.add(join);
		btnP.add(cancel);

		signUpPage.add(signUpText, BorderLayout.NORTH);
		signUpPage.add(formP, BorderLayout.CENTER);
		signUpPage.add(btnP, BorderLayout.SOUTH);

		signUpPage.setSize(500, 500);
		signUpPage.setVisible(true);
		signUpPage.setLocationRelativeTo(null);
		signUpPage.setResizable(false);

		join.addActionListener(this);
		cancel.addActionListener(this);
		sameIdCheck.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // ��ư �������� �̺�Ʈ �������̵�
		// TODO Auto-generated method stub
		if (e.getSource().equals(join)) {
			inputInfo(); // ȸ������ ��ư�� ������ inputInfo �޼ҵ� ȣ��
		} else if (e.getSource().equals(cancel)) {
			new Home(); // ��� ��ư�� ������ �ٽ� Ȩ�������� ���ư�����
			signUpPage.setVisible(false); // ȸ������ �������� ������
		} else if (e.getSource().equals(sameIdCheck)) {
			idCheck(); // �ߺ�Ȯ�� ��ư�� ������ idCheck �޼ҵ� ȣ��
		}
	}

	void idCheck() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userinfo;");
			String id = this.id.getText();
			if (resultSet.next()) { // �ʵ���� ���������� ���� ������ �ܼ�â�� �ڷḦ �Է��Ѵ�. (���� �ڷᰡ ���������� ��µ�)
				if (resultSet.getString("id").equals(id)) {
					JOptionPane.showMessageDialog(null, "������ ID�� �����մϴ�.");
				} else if (id.length() > 11 || id.length() <= 3) {
					JOptionPane.showMessageDialog(null, "���̵�� 4 ~ 12 ���ڷ� �Է����ּ���.");
				} else {
					JOptionPane.showMessageDialog(null, "��밡���� ID�Դϴ�.");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	void inputInfo() {

		// ȸ������ Ŭ������ �Է¹��� �� ������
		userName = name.getText();
		userId = id.getText();
		userPw = new String(pw.getPassword());
		userNewsagency = (String) newsagency.getSelectedItem();
		userPhNum1 = phNum1.getText();
		userPhNum2 = phNum2.getText();
		userPhNum3 = phNum3.getText();
		userBirth = birth.getText();
		userFirstEmail = firstEmail.getText();
		userMiddleEmail = middleEmail.getText();
		userLastEmail = lastEmail.getText();	

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			if (userName.length() > 12 || userName.length() <= 1) {
				JOptionPane.showMessageDialog(null, "�̸��� 2~12 ���ڷ� �Է����ּ���.");
			} else if (userId.length() > 11 || userId.length() <= 3) {
				JOptionPane.showMessageDialog(null, "���̵�� 4 ~ 12 ���ڷ� �Է����ּ���.");
			} else if (userPw.length() > 20 || userPw.length() <= 7) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� 8 ~ 20 ���ڷ� �Է����ּ���.");
			} else if (userPhNum1.length() != 3 || userPhNum2.length() != 4 || userPhNum3.length() != 4) {
				JOptionPane.showMessageDialog(null, "����ó�� ���� ���� 4�ڸ��� �Է����ּ���.");
			} else if (userBirth.length() != 6) {
				JOptionPane.showMessageDialog(null, "��������� 6���ڷ� �Է����ּ���.\nex)YYMMDD(960228)");
			} else if (userFirstEmail.equals("") || userLastEmail.equals(null) || userLastEmail.equals("")) {
				JOptionPane.showMessageDialog(null, "�̸��� �ּҸ� �Է����ּ���.");
			} else {
				/* ���� */
				if (this.male.isSelected()) {
					userGender = male.getText();
				} else if (this.female.isSelected()) {
					userGender = female.getText();
				}
				statement.executeUpdate(
						"insert into userinfo(name,id,pw,newsagency,firstPhoneNum,middlePhoneNum,lastPhoneNum,birth,gender,firstEmail,middleEmail,lastEmail)"
								+ "values('" + userName + "'" + "," + "'" + userId + "'" + "," + "'" + userPw + "'"
								+ "," + "'" + userNewsagency + "'" + "," + "'" + userPhNum1 + "'" + "," + "'"
								+ userPhNum2 + "'" + "," + "'" + userPhNum3 + "'" + "," + "'" + userBirth + "'" + ","
								+ "'" + userGender + "'" + "," + "'" + userFirstEmail + "'" + "," + "'"
								+ userMiddleEmail + "'" + "," + "'" + userLastEmail + "'" + ");");
				JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�.");
				signUpPage.setVisible(false);
				new Home(); // ������ �Ϸ�Ǹ� �ٽ� Ȩ������ ȭ���� ��������
			}

		} catch (Exception e) {
			// TODO: handle exception
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

	@Override
	public void windowClosing(WindowEvent e) {
		signUpPage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // �⺻ �ݱ� �۾� ����
		Home home = new Home();
		home.homePage.setVisible(true);
	}
}
