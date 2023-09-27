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
			// 필드에 새로운 내용을 추가하는 문장이다.			
			// return 값이 int 형태이기 때문에 정수형 변수에 담아줘야 한다.
			// 프로그램을 실행시키면 sql에 새로운 내용이 업데이트 된 것을 확인할 수 있다.
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
