package com.jslee.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/helloworld", "root", "xhddlf336!");
			statement = connection.createStatement();
			int i = statement.executeUpdate("insert into score(java, web, jsp) values(90,100,60);");
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
