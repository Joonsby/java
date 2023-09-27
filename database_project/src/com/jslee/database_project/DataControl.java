package com.jslee.database_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DataControl {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	Scanner sc = new Scanner(System.in);	
	String name;
	int java,web;
	ArrayList<UserInfo> student = new ArrayList<UserInfo>();

	// ���� �Է�
	void input(String name, int java, int web) {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			statement.executeUpdate("insert into score(name,java,web) values (" + "'" + name + "'" + "," + java + "," + web + ");");			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}		
	}

	// �л� ���� ���
	void print(String name) {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score where name =" + "'" + name + "';");
			// resultSet�� �����ϴ� ���� �Ұ����ϴ�. connection�� statement�� �־�� �Ǳ� �����̴�.
			if (resultSet.next()) {
				System.out.println("-----------------------");
				System.out.println("�л��� �̸��� [" + resultSet.getString("name") + "]�Դϴ�.");
				System.out.println("java ������ [" + resultSet.getInt("java") + "]�Դϴ�.");
				System.out.println("web ������ [" + resultSet.getInt("web") + "]�Դϴ�.");
				System.out.println("-----------------------");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

	// �л� ���� ��ü ���
	ArrayList<UserInfo> printAll() {		
		try {			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score"); // score table ���� ���� ���			
			// �л��� �������� ������ �Ǳ� ������ Collection�� ����ؾ� �Ѵ�.
			while (resultSet.next()) { // resultSet�� ���� �ڷᰡ ���������� �ݺ��ؼ� name,java,web ��� (��ü ���)
				UserInfo userInfo = new UserInfo();
				userInfo.setName(resultSet.getString("name"));
				userInfo.setJava(resultSet.getInt("java"));
				userInfo.setWeb(resultSet.getInt("web"));
				student.add(userInfo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}		
		return student;
	}

	// �л� ���� ����
	void delete(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from score where name =" + "'" + name + "';");
			// �ʵ忡 ���ο� ������ �߰��ϴ� �����̴�.
			// return ���� int �����̱� ������ ������ ������ ������ �Ѵ�.
			// ���α׷��� �����Ű�� sql�� ���ο� ������ ������Ʈ �� ���� Ȯ���� �� �ִ�.
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}		
	}	
}