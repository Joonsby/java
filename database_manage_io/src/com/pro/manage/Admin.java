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

	// ������ ���� ȭ�� Frame
	JFrame adminFrame = new JFrame("������ ���");
	JPanel titlePanel = new JPanel();
	JPanel searchPanel = new JPanel();
	JPanel searchAllPanel = new JPanel();
	JPanel logoutPanel = new JPanel();
	JTextField userId = new JTextField(10);

	// �˻� ��ȸ ������
	JFrame searchFrame = new JFrame("ȸ�� ���� ��ȸ");
	// �˻� ��ȸ ���� �г�
	JPanel searchTitlePanel = new JPanel();
	// �˻� ��ȸ ���� ��
	JLabel searchTitleText = new JLabel("������ - ȸ�� ���� ��ȸ");
	// �˻� ��ȸ �ݱ� ��ư
	JButton searchCloseBtn = new JButton("�ݱ�");

	// JPanel
	JPanel namePanel = new JPanel();
	JPanel idPanel = new JPanel();
	JPanel phonePanel = new JPanel();
	JPanel birthPanel = new JPanel();
	JPanel genderPanel = new JPanel();
	JPanel mailPanel = new JPanel();
	JPanel closeBtnPanel = new JPanel();

	// �˻� ��ȸ�� �ʿ��� ��
	JLabel name = new JLabel();
	JLabel id = new JLabel();
	JLabel phone = new JLabel();
	JLabel birth = new JLabel();
	JLabel gender = new JLabel();
	JLabel email = new JLabel();

	// ��ü ��ȸ Frame
	JButton searchAllBtn = new JButton("��ü ��ȸ");
	JButton searchBtn = new JButton("��ȸ");
	JButton logoutBtn = new JButton("�α׾ƿ�");
	JButton exitBtn = new JButton("����");
	JLabel adminTitle = new JLabel("������ ȭ���Դϴ�.");

	void mainFrame() {
		// ������ ����ȭ�� ������ ����
		adminFrame.setSize(300, 300);
		adminFrame.setVisible(true);
		adminFrame.setLocationRelativeTo(null);
		adminFrame.setResizable(false);
		adminFrame.setLayout(new GridLayout(4, 1));
		adminFrame.add(titlePanel);
		adminFrame.add(searchAllPanel);
		adminFrame.add(searchPanel);
		adminFrame.add(logoutPanel);

		titlePanel.add(adminTitle); // ������ ȭ�� ����
		searchAllPanel.add(searchAllBtn); // ȸ�� ���� ��ü ��� ��ư
		searchPanel.add(userId); // ȸ�� ���� textfield
		searchPanel.add(searchBtn); // ȸ�� ���� ��� ��ư
		logoutPanel.add(logoutBtn); // �α׾ƿ� ��ư
		logoutPanel.add(exitBtn); // ���α׷� ���� ��ư

		// Btn�� event �߰�
		searchAllBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		logoutBtn.addActionListener(this);
		exitBtn.addActionListener(this);
	}

	// ��ü ȸ�� ���� ��ȸ �޼ҵ�
	void searchAllFrame() {
		// ���ڿ� �迭 ������ ArrayList ����
		ArrayList<String[]> userinfoList = new ArrayList<String[]>();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userinfo;");
			while (resultSet.next()) {
				// ȸ�������� ������ ����
				String name = resultSet.getString("name");
				String id = resultSet.getString("id");
				String phone = resultSet.getString("newsagency") + " " + resultSet.getString("firstPhoneNum") + "-"
						+ resultSet.getString("middlePhoneNum") + "-" + resultSet.getString("lastPhoneNum");
				String birth = resultSet.getString("birth");
				String gender = resultSet.getString("gender");
				String email = resultSet.getString("firstEmail") + resultSet.getString("middleEmail")
						+ resultSet.getString("lastEmail");

				// �ߺ��� �������� Ȯ��
				boolean isDuplicate = false;
				// ArrayList�� ����� ȸ�� ������ userinfo��� ���ο� ���ڿ� �迭�� ����
				for (String[] userinfo : userinfoList) {
					if (userinfo[0].equals(name) && userinfo[1].equals(id) && userinfo[2].equals(phone)
							&& userinfo[3].equals(birth) && userinfo[4].equals(gender) && userinfo[5].equals(email)) {
						isDuplicate = true;
						break;
					}
				}

				// �ߺ����� ���� ������ ��쿡�� userinfoList�� �߰�
				if (!isDuplicate) {
					String[] userinfo = { name, id, phone, birth, gender, email };
					userinfoList.add(userinfo);
				}
			}

			// ��ü ȸ�� ���� ��� ������
			JFrame searchAllframe = new JFrame("��ü ȸ�� ���� ���");

			// ���̺� header�� �� ������ �迭�� ����
			String header[] = { "�̸�", "���̵�", "��ȭ��ȣ", "�������", "����", "�̸���" };

			// ���� ArrayList userinfo�� ������ŭ �����ǰ� ���� 6���� 2���� �迭 ����
			String[][] contents = new String[userinfoList.size()][6];

			// userinfo�� ����� ��ҵ��� 'contents'�迭�� ��ȯ�Ͽ� ����
			contents = userinfoList.toArray(contents);

			// contents �迭�� header �迭�� ����Ͽ� DefaultTableModel ��ü ����
			// DefaultTableModel�� JTable���� �����͸� �����ϴ� �� Ŭ�����̴�.
			DefaultTableModel model = new DefaultTableModel(contents, header);

			// �����س��� DefaultTableModel�� ������ ���̺� ����
			JTable table = new JTable(model);

			// ���̺��� ������ ������� ��ũ�� ������ ���·� ������
			JScrollPane scrollPane = new JScrollPane(table);

			// ���̺� �ؽ�Ʈ ��� ����
			DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
			dtcr.setHorizontalAlignment(SwingConstants.CENTER);

			// JTable�� Column(��)�� ���õ� ������ �����ϱ� ���� ��
			TableColumnModel tcm = table.getColumnModel();

			// ��� Column(��)�� CellRenderer�� dtcr�� �����Ͽ� �ؽ�Ʈ�� ��� ����
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

	// ȸ�� ���� ��ȸ �޼ҵ�
	void searchUser() {
		// �ؽ�Ʈ�� ȸ������ ���翩��
		boolean isExist = false;

		// �ؽ�Ʈ�� ȸ�������� ������� ��
		if (userId.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "�˻��� ȸ���� ���̵� �Է��ϼ���.");
			isExist = true;
		}

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manageproject", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from userInfo;");

			while (resultSet.next()) {
				// �ؽ�Ʈ�� �Է��� ȸ�� ���̵�� �������� ȸ�� ���̵� ��ġ�ϴ� ���
				if (userId.getText().equals(resultSet.getString("id"))) {
					isExist = true;
					name.setText("�̸� : " + resultSet.getString("name"));
					id.setText("���̵� : " + resultSet.getString("id"));
					phone.setText("����ó : " + resultSet.getString("firstPhoneNum") + " - "
							+ resultSet.getString("middlePhoneNum") + " - " + resultSet.getString("lastPhoneNum"));
					birth.setText("������� : " + resultSet.getString("birth"));
					gender.setText("���� : " + resultSet.getString("gender"));
					email.setText("�̸��� : " + resultSet.getString("firstEmail") + resultSet.getString("middleEmail")
							+ resultSet.getString("lastEmail"));

					// ���� ��ȸ ������ �⺻ ����
					searchFrame.setSize(300, 500);
					searchFrame.setVisible(true);
					searchFrame.setLocationRelativeTo(null);
					searchFrame.setResizable(false);
					searchFrame.setLayout(new GridLayout(8, 1));

					// ���� ��ȸ �����ӿ� �г� �߰�
					searchFrame.add(searchTitlePanel);
					searchFrame.add(namePanel);
					searchFrame.add(idPanel);
					searchFrame.add(phonePanel);
					searchFrame.add(birthPanel);
					searchFrame.add(genderPanel);
					searchFrame.add(mailPanel);
					searchFrame.add(closeBtnPanel);

					// ���� ��ȸ �гο� ��ư �߰�
					searchTitlePanel.add(searchTitleText);
					namePanel.add(name);
					idPanel.add(id);
					phonePanel.add(phone);
					birthPanel.add(birth);
					genderPanel.add(gender);
					mailPanel.add(email);
					closeBtnPanel.add(searchCloseBtn);

					// �ݱ� ��ư�� �̺�Ʈ �߰�
					searchCloseBtn.addActionListener(this);
					break;
				}
			}
			if (!isExist) { // �ؽ�Ʈ�� �Է��� ȸ�� ���̵�� �������� ȸ�� ���̵� ��ġ���� �ʴ� ���
				JOptionPane.showMessageDialog(null, "�Է��Ͻ� ȸ���� ������ �����ϴ�.");
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

	// �α׾ƿ� �޼ҵ�
	void logOut() {
		int logout = JOptionPane.showConfirmDialog(null, "�α׾ƿ� �Ͻðڽ��ϱ�?", "�α� �ƿ�", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (logout == JOptionPane.YES_OPTION) {
			adminFrame.setVisible(false);
			new Home();
		}
	}

	// ���� �޼ҵ�
	void exit() {
		int exit = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null);
		if (exit == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == searchAllBtn) { // ȸ������ ��ü��ȸ ��ư
			searchAllFrame();
		} else if (e.getSource() == searchBtn) { // ȸ������ ��ȸ ��ư
			searchUser(); // ȸ������ ��ȸ ������ �޼ҵ�
		} else if (e.getSource() == searchCloseBtn) { // ȸ������ �ݱ� ��ư
			searchFrame.setVisible(false);
		} else if (e.getSource() == logoutBtn) { // �α׾ƿ� ��ư
			logOut();
		} else if (e.getSource() == exitBtn) { // ���� ��ư
			exit();
		}
	}
}
