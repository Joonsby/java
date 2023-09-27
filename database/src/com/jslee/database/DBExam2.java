package com.jslee.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finally���� ����ϱ� ���ؼ� ���������� ����.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jsp", "root","xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from goodsinfo;");
			while (resultSet.next()) { // �ʵ���� ���������� ���� ������ �ܼ�â�� �ڷḦ �Է��Ѵ�. (���� �ڷᰡ ���������� ��µ�)
				System.out.println(resultSet.getString("code"));
				System.out.println(resultSet.getString("title"));
				System.out.println(resultSet.getString("writer"));
				System.out.println(resultSet.getInt("price"));
			}			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				statement.close();
				resultSet.close();
				connection.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			// ���α׷��� ������ �ִ� ���� ������ connection, statement ��δ� close�� �ݾ���� �Ѵ�.
			// �ݴ� ������ statment -> connection �����̴�.
		}
	}

}
