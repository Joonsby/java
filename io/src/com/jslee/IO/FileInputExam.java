package com.jslee.IO;

import java.io.FileInputStream;

public class FileInputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f = null; // FileInputStream Ŭ������ ����Ͽ� ���� �Է� ��Ʈ���� �����ϰ�, ���Ͽ��� �����͸� �д� �۾��� �����մϴ�.
		try {
			f = new FileInputStream("D:\\manage_io_data\\id\\test.txt");
			System.out.println("available = " + f.available()); // "available()" �޼��带 ����Ͽ� ���� �Է� ��Ʈ������ ���� �� �ִ� ����Ʈ ���� ����մϴ�.
			byte b[] = new byte [f.available()]; // byte�� ������ �� �ִ� ����ŭ �迭�� �����Ѵ�.
			
			while(f.read(b) != -1) {} // -1�� file�� �������� �ǹ��Ѵ�. f�κ��� ������ file�� ���������� ����ؼ� �а� b���ٰ� ��� �״´�.
			
			String data = new String(b);
			System.out.println(data);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				f.close();
			} catch (Exception e) {
				System.out.println(e + " => �ݱ� ����");
			}
		}
	}

}
