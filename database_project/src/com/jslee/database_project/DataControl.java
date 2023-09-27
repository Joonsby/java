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

	// 성적 입력
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

	// 학생 정보 출력
	void print(String name) {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score where name =" + "'" + name + "';");
			// resultSet를 리턴하는 것은 불가능하다. connection과 statement가 있어야 되기 때문이다.
			if (resultSet.next()) {
				System.out.println("-----------------------");
				System.out.println("학생의 이름은 [" + resultSet.getString("name") + "]입니다.");
				System.out.println("java 성적은 [" + resultSet.getInt("java") + "]입니다.");
				System.out.println("web 성적은 [" + resultSet.getInt("web") + "]입니다.");
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

	// 학생 정보 전체 출력
	ArrayList<UserInfo> printAll() {		
		try {			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select *from score"); // score table 안의 정보 출력			
			// 학생을 여러명을 만들어야 되기 때문에 Collection을 사용해야 한다.
			while (resultSet.next()) { // resultSet의 다음 자료가 없을때까지 반복해서 name,java,web 출력 (전체 출력)
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

	// 학생 정보 삭제
	void delete(String name) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manage", "root", "xhddlf336!");
			statement = connection.createStatement();
			int i = statement.executeUpdate("delete from score where name =" + "'" + name + "';");
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