package com.jslee.IO;

import java.io.File;

import java.sql.Date;

// IO를 할때는 무조건 예외처리를 해야된다. 그렇지 않으면 이클립스에서 오류가 난다.

public class IO {
	public static void main(String[] args) throws Exception { // throws는 메소드 전체에 try catch문을 거는 것이다.
//		try {throws를 안걸었을 때와 동일하다.
		String name = "hello";
		File f = new File("D:\\manage_io_data\\id\\result.txt");
//		File f = new File("C:\Users\Administrator.User -2023UCZMH\Desktop\이준섭");
		if (f.exists()) { // 파일 또는 디렉터리가 실제로 존재하는지 확인합니다.
			System.out.println("존재");
			if (f.isDirectory()) { // 만약 f가 폴더인지 확인한다.
				System.out.println("**** 폴더 정보 ****");
				String[] data = f.list(); // 디렉터리 내의 파일 및 하위 디렉터리의 이름 목록을 문자열 배열로 가져옵니다.
				for (String s : data) { // for-each 문을 사용하여 data 배열의 각 요소를 순회합니다.
					System.out.println(s); // 파일 또는 디렉터리의 이름을 출력합니다.
				}
			} else {
				System.out.println("**** 파일 정보 ****");
				System.out.println("파일 이름 : " + f.getName()); // 파일의 이름을 출력합니다.
				System.out.println("절대 경로 : " + f.getAbsolutePath()); // 파일의 절대 경로를 출력합니다.
				System.out.println("읽기 기능 : " + f.canRead()); // 파일을 읽을 수 있는지 여부를 출력합니다.
				System.out.println("쓰기 기능 : " + f.canWrite()); // 파일에 쓸 수 있는지 여부를 출력합니다.
				System.out.println("파일 용량 : " + f.length() + "byte"); // 파일의 크기를 바이트 단위로 출력합니다.				

				long time = f.lastModified(); // 파일의 마지막 수정 시간을 가져옵니다.
				Date lastModifier = new Date(time); // lastModified 시간을 Date 객체로 변환합니다.
				System.out.println("수정 날짜 : " + lastModifier); // 파일의 수정 날짜를 출력합니다.

				f.delete(); // 파일을 삭제합니다.
			}
		} else { // 해당 File 객체가 존재하지 않는 경우 실행됩니다.
			System.out.println("없습니다.");
//			f.mkdir(); // 디렉터리를 생성합니다.
			f.createNewFile();
		}
//		} catch(Exception e) {
//			
//		}throws를 안걸었을 때와 동일하다.
	}
}
