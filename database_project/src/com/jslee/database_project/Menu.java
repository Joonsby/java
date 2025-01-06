package com.jslee.database_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {	
	public void input(){
		DataControl dataControl = new DataControl(); // DataControl 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		System.out.println("java 성적을 입력하세요");
		int java = sc.nextInt();
		
		System.out.println("web 성적을 입력하세요");
		int web = sc.nextInt();
		
		sc.close();
		dataControl.input(name,java,web); // DataControl에서 name,java,web의 값을 호출과 동시에 가져옴.
		System.out.println("[" + name + "]학생의 정보가 입력되었습니다.");
	}
	
	public void printAll() {
		DataControl dataControl = new DataControl();
		ArrayList<UserInfo> student = dataControl.printAll();		
		for (int i = 0; i < student.size(); i++) {
			System.out.println((i + 1) + "번째 학생의 정보입니다.");
			System.out.println("이름은 " + "[" + student.get(i).getName() + "]입니다.");
			System.out.println("java 성적은 " + "[" + student.get(i).getJava() + "]입니다.");
			System.out.println("web 성적은 " + "[" + student.get(i).getWeb() + "]입니다.");
			System.out.println("-----------------------");
		}		
	}
}
