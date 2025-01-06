package com.jslee.database_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DataControl {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	private void conn() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage?characterEncoding=utf8&useSSL=false", "root", "xhddlf336!");
			stmt = conn.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		try {
			close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// ���� �Է�
	public void input(String name, int java, int web) {
		try {
			conn();
			stmt.executeUpdate("insert into score(name,java,web) values (" + "'" + name + "'" + "," + java + "," + web + ");");			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}

	// �л� ���� ���
	public void print(String name) {
		try {
			conn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select *from score where name =" + "'" + name + "';");
			// resultSet�� �����ϴ� ���� �Ұ����ϴ�. connection�� statement�� �־�� �Ǳ� �����̴�.
			if (rs.next()) {
				System.out.println("-----------------------");
				System.out.println("�л��� �̸��� [" + rs.getString("name") + "]�Դϴ�.");
				System.out.println("java ������ [" + rs.getInt("java") + "]�Դϴ�.");
				System.out.println("web ������ [" + rs.getInt("web") + "]�Դϴ�.");
				System.out.println("-----------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// �л� ���� ��ü ���
	public ArrayList<UserInfo> printAll() {
		ArrayList<UserInfo> student = new ArrayList<UserInfo>();
		try {
			conn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select *from score"); // score table ���� ���� ���			
			// �л��� �������� ������ �Ǳ� ������ Collection�� ����ؾ� �Ѵ�.
			while (rs.next()) { // resultSet�� ���� �ڷᰡ ���������� �ݺ��ؼ� name,java,web ��� (��ü ���)
				UserInfo userInfo = new UserInfo();
				userInfo.setName(rs.getString("name"));
				userInfo.setJava(rs.getInt("java"));
				userInfo.setWeb(rs.getInt("web"));
				student.add(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		return student;
	}

	// �л� ���� ����
	public void delete(String name) {
		try {
			conn();
			stmt = conn.createStatement();
			stmt.executeUpdate("delete from score where name =" + "'" + name + "';");
			// �ʵ忡 ���ο� ������ �߰��ϴ� �����̴�.
			// return ���� int �����̱� ������ ������ ������ ������ �Ѵ�.
			// ���α׷��� �����Ű�� sql�� ���ο� ������ ������Ʈ �� ���� Ȯ���� �� �ִ�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
}