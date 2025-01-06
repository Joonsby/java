package com.jslee.IO;

import java.io.FileInputStream;

public class FileInputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f = null; // FileInputStream 클래스를 사용하여 파일 입력 스트림을 생성하고, 파일에서 데이터를 읽는 작업을 수행합니다.
		try {
			f = new FileInputStream("D:\\manage_io_data\\id\\test.txt");
			System.out.println("available = " + f.available()); // "available()" 메서드를 사용하여 파일 입력 스트림에서 읽을 수 있는 바이트 수를 출력합니다.
			byte b[] = new byte [f.available()]; // byte를 생성할 수 있는 수만큼 배열을 생성한다.
			
			while(f.read(b) != -1) {} // -1은 file의 마지막을 의미한다. f로부터 마지막 file을 읽을때까지 계속해서 읽고 b에다가 계속 쌓는다.
			
			String data = new String(b);
			System.out.println(data);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				f.close();
			} catch (Exception e) {
				System.out.println(e + " => 닫기 실패");
			}
		}
	}

}
