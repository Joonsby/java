package com.jslee.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInWriterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator.User -2023JNJRO\\Desktop\\�� ����\\text.txt"));
			
			String data = null;
			System.out.println("�Է� : ");
			while(!(data=br.readLine()).equals("quit")){ // quit�� �Է��ϸ� while�� Ż��
				bw.write(data); // file�� data��� String������ �Է��Ѵ�.  
				bw.newLine(); // ���ο� �ٷ� �̵�
				System.out.println("�Է� ���� : " + data);
				System.out.println("�Է� : ");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
