package com.jslee.database;

import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// getConnection�� �����ε��̴�.
			// DriverManager�� sql�� �����ϱ� ���� Ŭ�����̴�.
			// user ������ root �ϳ��̴�.
			// jdbc�� https ó�� sql�� �����ϱ� ���� ����̴�.
			// jdbc:mysql�� �Է��ϸ� ����  mysql�� ������ �� �ִ�. oracle�� �ٲٸ� oracle�� ������ �� �ִ�.			
			// localhost�� ���� ��Ī�ϴ� ���̴�.
			// 3306�� default ��ġ�̴�.
			// helloworld�� ���� �������� database���̴�.
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "xhddlf336!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			// mysql ����Ʈ�� �����ؼ� Connecter�� �ٿ�ε� �ؾߵȴ�.
			// Connecter�� mysql�� ������ ����� �Ѵ�. Connecter�̱� ������ ��Ȯ�� ������ ������� ����.
			// Connecter�� �⺻������ �����ϴ� Ŭ�������� �ֱ� ������ �޴��� ���ð� ����� �����̶�� �����ϸ� �ȴ�.
			// Connecter �����ϴ� ���
			// 1.Java Project ��Ŭ�� 
			// 2.Properties ����
			// 3.Java Build Path ����
			// 4.Libraries Tab ����
			// 5.mysql���� �ٿ�ް� ����Ǯ���� Connecter ���� �ȿ� jar ���� ���� (bin�� �� ����ȭ �� ���̱� ������ bin�� �����ϴ� ���� ����.)
		}
	}

}
