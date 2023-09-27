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
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator.User -2023JNJRO\\Desktop\\새 폴더\\text.txt"));
			
			String data = null;
			System.out.println("입력 : ");
			while(!(data=br.readLine()).equals("quit")){ // quit을 입력하면 while문 탈출
				bw.write(data); // file에 data라는 String변수를 입력한다.  
				bw.newLine(); // 새로운 줄로 이동
				System.out.println("입력 내용 : " + data);
				System.out.println("입력 : ");
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
