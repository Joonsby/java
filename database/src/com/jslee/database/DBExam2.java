package com.jslee.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finally에서 사용하기 위해서 전역변수로 선언.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jsp", "root","xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from goodsinfo;");
			while (resultSet.next()) { // 필드안의 다음내용이 없을 때까지 콘솔창에 자료를 입력한다. (다음 자료가 없을때까지 출력됨)
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
			// 프로그램에 문제가 있던 없던 무조건 connection, statement 모두다 close로 닫아줘야 한다.
			// 닫는 순서는 statment -> connection 순서이다.
		}
	}

}
