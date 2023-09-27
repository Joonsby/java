package com.pro.manage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Admin implements ActionListener {

	Connection connection;
	Statement statement;
	ResultSet resultSet;

	// 관리자 메인 화면 Frame
	JFrame adminFrame = new JFrame("관리자 모드");
	JPanel titlePanel = new JPanel();
	JPanel searchPanel = new JPanel();
	JPanel searchAllPanel = new JPanel();
	JPanel logoutPanel = new JPanel();
	JTextField userId = new JTextField(10);

	// 검색 조회 프레임
	JFrame searchFrame = new JFrame("회원 정보 조회");
	// 검색 조회 제목 패널
	JPanel searchTitlePanel = new JPanel();
	// 검색 조회 제목 라벨
	JLabel searchTitleText = new JLabel("관리자 - 회원 정보 조회");
	// 검색 조회 닫기 버튼
	JButton searchCloseBtn = new JButton("닫기");

	// JPanel
	JPanel namePanel = new JPanel();
	JPanel idPanel = new JPanel();
	JPanel phonePanel = new JPanel();
	JPanel birthPanel = new JPanel();
	JPanel genderPanel = new JPanel();
	JPanel mailPanel = new JPanel();
	JPanel closeBtnPanel = new JPanel();

	// 검색 조회에 필요한 라벨
	JLabel name = new JLabel();
	JLabel id = new JLabel();
	JLabel phone = new JLabel();
	JLabel birth = new JLabel();
	JLabel gender = new JLabel();
	JLabel email = new JLabel();

	// 전체 조회 Frame
	JButton searchAllBtn = new JButton("전체 조회");
	JButton searchBtn = new JButton("조회");
	JButton logoutBtn = new JButton("로그아웃");
	JButton exitBtn = new JButton("종료");
	JLabel adminTitle = new JLabel("관리자 화면입니다.");

	void mainFrame() {
		// 관리자 메인화면 프레임 설정
		adminFrame.setSize(300, 300);
		adminFrame.setVisible(true);
		adminFrame.setLocationRelativeTo(null);
		adminFrame.setResizable(false);
		adminFrame.setLayout(new GridLayout(4, 1));
		adminFrame.add(titlePanel);
		adminFrame.add(searchAllPanel);
		adminFrame.add(searchPanel);
		adminFrame.add(logoutPanel);

		titlePanel.add(adminTitle); // 관리자 화면 제목
		searchAllPanel.add(searchAllBtn); // 회원 정보 전체 출력 버튼
		searchPanel.add(userId); // 회원 정보 textfield
		searchPanel.add(searchBtn); // 회원 정보 출력 버튼
		logoutPanel.add(logoutBtn); // 로그아웃 버튼
		logoutPanel.add(exitBtn); // 프로그램 종료 버튼

		// Btn에 event 추가
		searchAllBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		logoutBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	}

	// 전체 회원 정보 조회 메소드
	void searchAllFrame() {
		// 문자열 배열 형태의 ArrayList 생성
		ArrayList<String[]> userinfoList = new ArrayList<String[]>();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userinfo;");
			while (resultSet.next()) {
				// 회원정보를 변수에 대입
				String name = resultSet.getString("name");
				String id = resultSet.getString("id");
				String phone = resultSet.getString("newsagency") + " " + resultSet.getString("firstPhoneNum") + "-"
						+ resultSet.getString("middlePhoneNum") + "-" + resultSet.getString("lastPhoneNum");
				String birth = resultSet.getString("birth");
				String gender = resultSet.getString("gender");
				String email = resultSet.getString("firstEmail") + resultSet.getString("middleEmail")
						+ resultSet.getString("lastEmail");

				// 중복된 문장인지 확인
				boolean isDuplicate = false;
				// ArrayList에 저장된 회원 정보를 userinfo라는 새로운 문자열 배열에 대입
				for (String[] userinfo : userinfoList) {
					if (userinfo[0].equals(name) && userinfo[1].equals(id) && userinfo[2].equals(phone)
							&& userinfo[3].equals(birth) && userinfo[4].equals(gender) && userinfo[5].equals(email)) {
						isDuplicate = true;
						break;
					}
				}

				// 중복되지 않은 문장인 경우에만 userinfoList에 추가
				if (!isDuplicate) {
					String[] userinfo = { name, id, phone, birth, gender, email };
					userinfoList.add(userinfo);
				}
			}

			// 전체 회원 정보 출력 프레임
			JFrame searchAllframe = new JFrame("전체 회원 정보 출력");

			// 테이블 header에 들어갈 내용을 배열로 선언
			String header[] = { "이름", "아이디", "전화번호", "생년월일", "성별", "이메일" };

			// 행은 ArrayList userinfo의 갯수만큼 생성되고 열은 6개인 2차원 배열 생성
			String[][] contents = new String[userinfoList.size()][6];

			// userinfo에 저장된 요소들을 'contents'배열로 변환하여 저장
			contents = userinfoList.toArray(contents);

			// contents 배열과 header 배열을 사용하여 DefaultTableModel 객체 생성
			// DefaultTableModel은 JTable에서 데이터를 관리하는 모델 클래스이다.
			DefaultTableModel model = new DefaultTableModel(contents, header);

			// 생성해놓은 DefaultTableModel을 가지고 테이블 생성
			JTable table = new JTable(model);

			// 테이블의 내용이 길어지면 스크롤 가능한 형태로 보여줌
			JScrollPane scrollPane = new JScrollPane(table);

			// 테이블 텍스트 가운데 정렬
			DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
			dtcr.setHorizontalAlignment(SwingConstants.CENTER);

			// JTable의 Column(열)과 관련된 설정을 관리하기 위한 모델
			TableColumnModel tcm = table.getColumnModel();

			// 모든 Column(열)의 CellRenderer로 dtcr을 설정하여 텍스트를 가운데 정렬
			for (int i = 0; i < tcm.getColumnCount(); i++) {
				tcm.getColumn(i).setCellRenderer(dtcr);
			}

			searchAllframe.add(scrollPane);
			searchAllframe.setLocation(500, 300);
			searchAllframe.setSize(1000, 500);
			searchAllframe.setVisible(true);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 회원 정보 조회 메소드
	void searchUser() {
		// 텍스트에 회원정보 존재여부
		boolean isExist = false;

		// 텍스트에 회원정보가 비어있을 때
		if (userId.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "검색할 회원의 아이디를 입력하세요.");
			isExist = true;
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userInfo;");

			while (resultSet.next()) {
				// 텍스트에 입력한 회원 아이디와 데이터의 회원 아이디가 일치하는 경우
				if (userId.getText().equals(resultSet.getString("id"))) {
					isExist = true;
					name.setText("이름 : " + resultSet.getString("name"));
					id.setText("아이디 : " + resultSet.getString("id"));
					phone.setText("연락처 : " + resultSet.getString("firstPhoneNum") + " - "
							+ resultSet.getString("middlePhoneNum") + " - " + resultSet.getString("lastPhoneNum"));
					birth.setText("생년월일 : " + resultSet.getString("birth"));
					gender.setText("성별 : " + resultSet.getString("gender"));
					email.setText("이메일 : " + resultSet.getString("firstEmail") + resultSet.getString("middleEmail")
							+ resultSet.getString("lastEmail"));

					// 성적 조회 프레임 기본 설정
					searchFrame.setSize(300, 500);
					searchFrame.setVisible(true);
					searchFrame.setLocationRelativeTo(null);
					searchFrame.setResizable(false);
					searchFrame.setLayout(new GridLayout(8, 1));

					// 성적 조회 프레임에 패널 추가
					searchFrame.add(searchTitlePanel);
					searchFrame.add(namePanel);
					searchFrame.add(idPanel);
					searchFrame.add(phonePanel);
					searchFrame.add(birthPanel);
					searchFrame.add(genderPanel);
					searchFrame.add(mailPanel);
					searchFrame.add(closeBtnPanel);

					// 성적 조회 패널에 버튼 추가
					searchTitlePanel.add(searchTitleText);
					namePanel.add(name);
					idPanel.add(id);
					phonePanel.add(phone);
					birthPanel.add(birth);
					genderPanel.add(gender);
					mailPanel.add(email);
					closeBtnPanel.add(searchCloseBtn);

					// 닫기 버튼에 이벤트 추가
					searchCloseBtn.addActionListener(this);
					break;
				}
			}
			if (!isExist) { // 텍스트에 입력한 회원 아이디와 데이터의 회원 아이디가 일치하지 않는 경우
				JOptionPane.showMessageDialog(null, "입력하신 회원의 정보가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

	// 로그아웃 메소드
	void logOut() {
		int logout = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그 아웃", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (logout == JOptionPane.YES_OPTION) {
			adminFrame.setVisible(false);
			new Home();
		}
	}

	// 종료 메소드
	void exit() {
		int exit = JOptionPane.showConfirmDialog(null, "종료 하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (exit == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == searchAllBtn) { // 회원정보 전체조회 버튼
			searchAllFrame();
		} else if (e.getSource() == searchBtn) { // 회원정보 조회 버튼
			searchUser(); // 회원정보 조회 프레임 메소드
		} else if (e.getSource() == searchCloseBtn) { // 회원정보 닫기 버튼
			searchFrame.setVisible(false);
		} else if (e.getSource() == logoutBtn) { // 로그아웃 버튼
			logOut();
		} else if (e.getSource() == exitBtn) { // 종료 버튼
			exit();
		}
	}
}
