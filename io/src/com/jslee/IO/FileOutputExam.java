package com.jslee.IO;

import java.io.FileOutputStream;

public class FileOutputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream f = null; // FileOutputStream �� ������ �ش� ������ �����Ѵ�. �����ϴ� ������ ��� �������.
		try {
//			f = new FileOutputStream("C:\\Users\\Administrator.User -2023JNJRO\\Desktop\\�� ����\\text.txt");
			f = new FileOutputStream("D:\\manage_io_data\\id\\test.txt", true);
			// true�� �ְ� �Ǹ� ������ output�ߴ� ������� �ʱ�ȭ�� ���� �ʰ� �����ȴ�.
			String data = "no";
			String data1 = "yes";
			byte b[] = data.getBytes(); // byte������ ��ȯ -> text���Ͽ� �� ������ byte������ ������ ������ ������.
			byte c[] = data1.getBytes(); 
			f.write(b); // ���Ͽ� "java"�� �Է��Ѵ�.
			f.write(c);
		} catch(Exception e) {
			System.out.println(e + " => ���Ͼ��� ����");
		} finally {
			try {
				f.close(); // �� �ƴ� �ٸ� ������ ������ ������ close�� �ؼ� �ݾ���� �Ѵ�. ���� �ƴ� �ٸ� ��ҵ鵵 ������ �� �ְ� �ȴ�. 
			} catch(Exception e) {
				System.out.println(e + " => close ����");
			}
		}
	}

}
