package com.jslee.database;

import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// getConnection은 오버로딩이다.
			// DriverManager은 sql을 연결하기 위한 클래스이다.
			// user 계정은 root 하나이다.
			// jdbc는 https 처럼 sql을 연결하기 위한 약속이다.
			// jdbc:mysql을 입력하면 나의  mysql을 연결할 수 있다. oracle로 바꾸면 oracle로 연결할 수 있다.			
			// localhost는 나를 지칭하는 것이다.
			// 3306은 default 위치이다.
			// helloworld는 내가 만들어놓은 database명이다.
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "xhddlf336!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			// mysql 사이트에 접속해서 Connecter를 다운로드 해야된다.
			// Connecter는 mysql과 버젼을 맞춰야 한다. Connecter이기 때문에 정확한 버젼을 맞출수는 없다.
			// Connecter에 기본적으로 제공하는 클래스들이 있기 때문에 휴대폰 어플과 비슷한 느낌이라고 생각하면 된다.
			// Connecter 연결하는 방법
			// 1.Java Project 우클릭 
			// 2.Properties 선택
			// 3.Java Build Path 선택
			// 4.Libraries Tab 선택
			// 5.mysql에서 다운받고 압축풀었던 Connecter 파일 안에 jar 파일 선택 (bin이 더 간소화 된 것이기 때문에 bin을 선택하는 것이 낫다.)
		}
	}

}
