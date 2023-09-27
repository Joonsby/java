package com.jslee.IO;

import java.io.File;

import java.sql.Date;

// IO�� �Ҷ��� ������ ����ó���� �ؾߵȴ�. �׷��� ������ ��Ŭ�������� ������ ����.

public class IO {
	public static void main(String[] args) throws Exception { // throws�� �޼ҵ� ��ü�� try catch���� �Ŵ� ���̴�.
//		try {throws�� �Ȱɾ��� ���� �����ϴ�.
		String name = "hello";
		File f = new File("D:\\manage_io_data\\id\\result.txt");
//		File f = new File("C:\Users\Administrator.User -2023UCZMH\Desktop\���ؼ�");
		if (f.exists()) { // ���� �Ǵ� ���͸��� ������ �����ϴ��� Ȯ���մϴ�.
			System.out.println("����");
			if (f.isDirectory()) { // ���� f�� �������� Ȯ���Ѵ�.
				System.out.println("**** ���� ���� ****");
				String[] data = f.list(); // ���͸� ���� ���� �� ���� ���͸��� �̸� ����� ���ڿ� �迭�� �����ɴϴ�.
				for (String s : data) { // for-each ���� ����Ͽ� data �迭�� �� ��Ҹ� ��ȸ�մϴ�.
					System.out.println(s); // ���� �Ǵ� ���͸��� �̸��� ����մϴ�.
				}
			} else {
				System.out.println("**** ���� ���� ****");
				System.out.println("���� �̸� : " + f.getName()); // ������ �̸��� ����մϴ�.
				System.out.println("���� ��� : " + f.getAbsolutePath()); // ������ ���� ��θ� ����մϴ�.
				System.out.println("�б� ��� : " + f.canRead()); // ������ ���� �� �ִ��� ���θ� ����մϴ�.
				System.out.println("���� ��� : " + f.canWrite()); // ���Ͽ� �� �� �ִ��� ���θ� ����մϴ�.
				System.out.println("���� �뷮 : " + f.length() + "byte"); // ������ ũ�⸦ ����Ʈ ������ ����մϴ�.				

				long time = f.lastModified(); // ������ ������ ���� �ð��� �����ɴϴ�.
				Date lastModifier = new Date(time); // lastModified �ð��� Date ��ü�� ��ȯ�մϴ�.
				System.out.println("���� ��¥ : " + lastModifier); // ������ ���� ��¥�� ����մϴ�.

				f.delete(); // ������ �����մϴ�.
			}
		} else { // �ش� File ��ü�� �������� �ʴ� ��� ����˴ϴ�.
			System.out.println("�����ϴ�.");
//			f.mkdir(); // ���͸��� �����մϴ�.
			f.createNewFile();
		}
//		} catch(Exception e) {
//			
//		}throws�� �Ȱɾ��� ���� �����ϴ�.
	}
}
