package com.jslee.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.sql�� �ִ� connection Ŭ������ �����;� �ȴ�.
		// �ڿ� �ִ� sql������ java�� ����ֱ� �����̴�.
		// database �������� connection ��ü �ȿ� ����ִ�. �׷��� ������ Connection �޼ҵ��� ��ɵ��� ����� �� �ִ�.
		
		// finally���� ����ϱ� ���ؼ� ���������� ����.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {	
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jsp", "root", "xhddlf336!");
			statement = connection.createStatement(); // DBâ�� �ƴϱ� ������ �����ϱ� ���� ������ ����ϱ� ���ؼ� createStatement�� ����Ѵ�.
			resultSet = statement.executeQuery("select *from goodsinfo;"); // ResultSet ���� Ÿ���� resultSet�̶�� ������ �����ߴ�.
			// if(resultSet.next()) // �ʵ���� ���� ������ ���ٸ� �ܼ�â�� �ڷḦ �Է��Ѵ�. (�ѹ��ۿ� ��� �ȵ�) 
			while(resultSet.next()) { // �ʵ���� ���������� ���� ������ �ܼ�â�� �ڷḦ �Է��Ѵ�. (���� �ڷᰡ ���������� ��µ�)
				System.out.println(resultSet.getString("code"));
				System.out.println(resultSet.getString("title"));
				System.out.println(resultSet.getString("writer"));
				System.out.println(resultSet.getInt("price"));
				// resultSet.getString(columnLabel) ���� �������� ���� ���� ������ String ���·� �����´�.
				// getString() �Ұ�ȣ �ȿ��� �ʵ���� String ���·� ���´�.
				// sql�� ������� ������Ÿ���� output�Ҷ��� ������ ������� �ȴ�. ex)String, varchar \\ int, int
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				statement.close();
				resultSet.close();
				connection.close();
				// ������ ������ ������ close�� ����
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
