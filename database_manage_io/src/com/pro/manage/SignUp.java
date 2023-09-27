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
	// 회원정보 전역변수 선언
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
	JFrame signUpPage = new JFrame("회원가입");
	// component 전역변수로 선언
	JLabel signUpText = new JLabel("회원가입", JLabel.CENTER);
	// 버튼
	JButton join = new JButton("회원가입");
	JButton cancel = new JButton("취소");
	JButton sameIdCheck = new JButton("중복 확인");
	// 이름
	JTextField name = new JTextField(5);
	// 아이디
	JTextField id = new JTextField(10);
	// 비밀번호
	JPasswordField pw = new JPasswordField(10);
	// 핸드폰 번호
	String num[] = new String[] { "SKT", "KT", "LG", "알뜰폰" };
	// String 형태의 combobox
	JComboBox<String> newsagency = new JComboBox<String>(num);
	JTextField phNum1 = new JTextField(3);
	JTextField phNum2 = new JTextField(4);
	JTextField phNum3 = new JTextField(4);
	// 생년월일
	JTextField birth = new JTextField(6);
	// 성별
	JRadioButton male = new JRadioButton("male");
	JRadioButton female = new JRadioButton("female");
	// 이메일
	JTextField firstEmail = new JTextField(10);
	JLabel middleEmail = new JLabel("@");
	JTextField lastEmail = new JTextField(15);

	// mysql 초기값 설정
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	void setFrame() { // 프레임 설정
		signUpPage.addWindowListener(new SignUp());
		// 성별
		ButtonGroup gen = new ButtonGroup(); // radio의 버튼 그룹
		male.setSelected(true);
		gen.add(male);
		gen.add(female);

		// panel
		JPanel nameP = new JPanel();
		nameP.add(new JLabel("이 름 : "));
		nameP.add(name);

		JPanel idP = new JPanel();
		idP.add(new JLabel("ID : "));
		idP.add(id);
		idP.add(sameIdCheck);

		JPanel pwP = new JPanel();
		pwP.add(new JLabel("PW : "));
		pwP.add(pw);

		JPanel phP = new JPanel();
		phP.add(new JLabel("연락처 : "));
		phP.add(newsagency);
		phP.add(phNum1);
		phP.add(phNum2);
		phP.add(phNum3);

		JPanel birthP = new JPanel();
		birthP.add(new JLabel("생년월일 : "));
		birthP.add(birth);

		JPanel genderP = new JPanel();
		genderP.add(new JLabel("성별 : "));
		genderP.add(male);
		genderP.add(female);

		JPanel mailP = new JPanel();
		mailP.add(new JLabel("이메일 : "));
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
	public void actionPerformed(ActionEvent e) { // 버튼 눌렀을때 이벤트 오버라이딩
		// TODO Auto-generated method stub
		if (e.getSource().equals(join)) {
			inputInfo(); // 회원가입 버튼을 누르면 inputInfo 메소드 호출
		} else if (e.getSource().equals(cancel)) {
			new Home(); // 취소 버튼을 누르면 다시 홈페이지로 돌아가도록
			signUpPage.setVisible(false); // 회원가입 페이지는 내리기
		} else if (e.getSource().equals(sameIdCheck)) {
			idCheck(); // 중복확인 버튼을 누르면 idCheck 메소드 호출
		}
	}

	void idCheck() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userinfo;");
			String id = this.id.getText();
			if (resultSet.next()) { // 필드안의 다음내용이 없을 때까지 콘솔창에 자료를 입력한다. (다음 자료가 없을때까지 출력됨)
				if (resultSet.getString("id").equals(id)) {
					JOptionPane.showMessageDialog(null, "동일한 ID가 존재합니다.");
				} else if (id.length() > 11 || id.length() <= 3) {
					JOptionPane.showMessageDialog(null, "아이디는 4 ~ 12 글자로 입력해주세요.");
				} else {
					JOptionPane.showMessageDialog(null, "사용가능한 ID입니다.");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	void inputInfo() {

		// 회원정보 클래스로 입력받은 값 보내기
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
				JOptionPane.showMessageDialog(null, "이름은 2~12 글자로 입력해주세요.");
			} else if (userId.length() > 11 || userId.length() <= 3) {
				JOptionPane.showMessageDialog(null, "아이디는 4 ~ 12 글자로 입력해주세요.");
			} else if (userPw.length() > 20 || userPw.length() <= 7) {
				JOptionPane.showMessageDialog(null, "비밀번호는 8 ~ 20 글자로 입력해주세요.");
			} else if (userPhNum1.length() != 3 || userPhNum2.length() != 4 || userPhNum3.length() != 4) {
				JOptionPane.showMessageDialog(null, "연락처는 국번 제외 4자리씩 입력해주세요.");
			} else if (userBirth.length() != 6) {
				JOptionPane.showMessageDialog(null, "생년월일은 6글자로 입력해주세요.\nex)YYMMDD(960228)");
			} else if (userFirstEmail.equals("") || userLastEmail.equals(null) || userLastEmail.equals("")) {
				JOptionPane.showMessageDialog(null, "이메일 주소를 입력해주세요.");
			} else {
				/* 성별 */
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
				JOptionPane.showMessageDialog(null, "가입이 완료되었습니다.");
				signUpPage.setVisible(false);
				new Home(); // 가입이 완료되면 다시 홈페이지 화면이 나오도록
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
		signUpPage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 기본 닫기 작업 무시
		Home home = new Home();
		home.homePage.setVisible(true);
	}
}
