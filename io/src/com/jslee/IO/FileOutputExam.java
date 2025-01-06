package com.jslee.IO;

import java.io.FileOutputStream;

public class FileOutputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream f = null; // FileOutputStream 은 무조건 해당 파일을 생성한다. 존재하는 파일일 경우 덮어쓰기함.
		try {
//			f = new FileOutputStream("C:\\Users\\Administrator.User -2023JNJRO\\Desktop\\새 폴더\\text.txt");
			f = new FileOutputStream("D:\\manage_io_data\\id\\test.txt", true);
			// true를 넣게 되면 이전에 output했던 내용들이 초기화가 되지 않고 누적된다.
			String data = "no";
			String data1 = "yes";
			byte b[] = data.getBytes(); // byte단위로 변환 -> text파일에 들어갈 단위를 byte단위로 맞추지 않으면 깨진다.
			byte c[] = data1.getBytes(); 
			f.write(b); // 파일에 "java"를 입력한다.
			f.write(c);
		} catch(Exception e) {
			System.out.println(e + " => 파일쓰기 실패");
		} finally {
			try {
				f.close(); // 나 아닌 다른 파일을 열었기 때문에 close를 해서 닫아줘야 한다. 내가 아닌 다른 요소들도 접근할 수 있게 된다. 
			} catch(Exception e) {
				System.out.println(e + " => close 실패");
			}
		}
	}

}
