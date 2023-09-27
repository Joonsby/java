package com.jslee.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java.sql에 있는 connection 클래스를 가져와야 된다.
		// 뒤에 있는 sql정보가 java에 들어있기 때문이다.
		// database 정보들이 connection 객체 안에 들어있다. 그렇기 때문에 Connection 메소드의 기능들을 사용할 수 있다.
		
		// finally에서 사용하기 위해서 전역변수로 선언.
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {	
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jsp", "root", "xhddlf336!");
			statement = connection.createStatement(); // DB창이 아니기 때문에 접근하기 위한 권한을 허용하기 위해서 createStatement를 사용한다.
			resultSet = statement.executeQuery("select *from goodsinfo;"); // ResultSet 리턴 타입을 resultSet이라는 변수에 저장했다.
			// if(resultSet.next()) // 필드안의 다음 내용이 없다면 콘솔창에 자료를 입력한다. (한번밖에 출력 안됨) 
			while(resultSet.next()) { // 필드안의 다음내용이 없을 때까지 콘솔창에 자료를 입력한다. (다음 자료가 없을때까지 출력됨)
				System.out.println(resultSet.getString("code"));
				System.out.println(resultSet.getString("title"));
				System.out.println(resultSet.getString("writer"));
				System.out.println(resultSet.getInt("price"));
				// resultSet.getString(columnLabel) 내가 가져오고 싶은 열의 제목을 String 형태로 가져온다.
				// getString() 소괄호 안에는 필드명을 String 형태로 적는다.
				// sql에 집어넣은 데이터타입을 output할때도 무조건 맞춰줘야 된다. ex)String, varchar \\ int, int
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				statement.close();
				resultSet.close();
				connection.close();
				// 문서을 열었기 때문에 close를 해줌
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
