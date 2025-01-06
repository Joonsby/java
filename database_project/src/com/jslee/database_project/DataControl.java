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

	// 성적 입력
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

	// 학생 정보 출력
	public void print(String name) {
		try {
			conn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select *from score where name =" + "'" + name + "';");
			// resultSet를 리턴하는 것은 불가능하다. connection과 statement가 있어야 되기 때문이다.
			if (rs.next()) {
				System.out.println("-----------------------");
				System.out.println("학생의 이름은 [" + rs.getString("name") + "]입니다.");
				System.out.println("java 성적은 [" + rs.getInt("java") + "]입니다.");
				System.out.println("web 성적은 [" + rs.getInt("web") + "]입니다.");
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

	// 학생 정보 전체 출력
	public ArrayList<UserInfo> printAll() {
		ArrayList<UserInfo> student = new ArrayList<UserInfo>();
		try {
			conn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select *from score"); // score table 안의 정보 출력			
			// 학생을 여러명을 만들어야 되기 때문에 Collection을 사용해야 한다.
			while (rs.next()) { // resultSet의 다음 자료가 없을때까지 반복해서 name,java,web 출력 (전체 출력)
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

	// 학생 정보 삭제
	public void delete(String name) {
		try {
			conn();
			stmt = conn.createStatement();
			stmt.executeUpdate("delete from score where name =" + "'" + name + "';");
			// 필드에 새로운 내용을 추가하는 문장이다.
			// return 값이 int 형태이기 때문에 정수형 변수에 담아줘야 한다.
			// 프로그램을 실행시키면 sql에 새로운 내용이 업데이트 된 것을 확인할 수 있다.
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