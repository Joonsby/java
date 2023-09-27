package com.jslee.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Input01 {
	Scanner sc = new Scanner(System.in);
	String name; // 객체 타입은 ==을 사용할 수 없다.
	int java, web;

	void input() {
		System.out.println("이름을 입력해주세요.");
		name = sc.next();
		System.out.println("java성적을 입력해주세요.");
		java = sc.nextInt();
		System.out.println("web성적을 입력해주세요.");
		web = sc.nextInt();
	}
	void output() {		
		System.out.println("이름은 [" + name + "]입니다.");
		System.out.println("java성적은 [" + java + "]입니다.");
		System.out.println("web 성적은 [" + web + "]입니다.");
		System.out.println("-----------------------------");
	}
}

class InputType {
	ArrayList<Input01> student = new ArrayList<Input01>(); // 객체 배열 생성 input 클래스 가져옴
	Scanner sc = new Scanner(System.in);
	void menu() {
		boolean isRun = true;
		while (isRun) {
			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("1.성적입력 \n2.성적출력 \n3.성적전체출력 \n4.정보삭제 \n5.종료");
			int menu = sc.nextInt(); // 메뉴를 선택할 값을 받아옴
			if (menu == 1) {
				Input01 std = new Input01(); // input 객체 선언
				std.input(); // input 클래스 안에 있는 input 메소드 호출
				student.add(std); // ArrayList<input> 객체 배열 안에 std값을 추가함
			} else if (menu == 2) {
				 /*
				  이름 입력				 
				 for (int i = 0; i < student.size(); i++) {				
				 		if(이름equals.(이름입력.get(i).name)){
				 			input std = new input(); // input 객체 선언				 			
							std = student.get(i);
							std.output();
				 		} 객체는 ==을 사용할 수 없기 때문에 equals 사용				 		
				 	}
				  */
				Input01 std = new Input01(); // input 객체 선언
				System.out.println("출력할 학생의 이름을 입력하세요");
				String inputName = sc.next(); // ArrayList<input> student 의 name의 값과 비교할 이름을 입력한다.	
				boolean find = false; // find라는 boolean형 변수 생성
				for (int i = 0; i < student.size(); i++) { 
					if(inputName.equals(student.get(i).name)) {
						find = true;
						// inputName이 student의 배열중에 하나라도 일치하는 것이 있다면 find는 true이다.
						// 입력된 학생의 값이 ArrayList<input> student 안에 있는 name의 값과 일치할 때까지 student의 배열 갯수만큼 반복해서 비교한다.
						// 일치한다면 일치하는 순서의 배열을 가져온다.
						std = student.get(i); // student의 i번재에 있는 배열을 가져온다 
						std.output(); // input 클래스에 있는 output 메소드 출력
					}
				}
				if (!find) { // 만약 find가 false라면 for문을 탈출하여 아래 문구를 출력한다. 
					System.out.println("입력한 정보의 학생이 없습니다.");
				}
			} else if (menu == 3) {
				Input01 std = new Input01(); // input 객체 선언
				for (int i = 0; i < student.size(); i++) {
					std = student.get(i); // student라는 이름의 ArrayList<input>에 있는 값을 std에 저장
					std.output(); // output 메소드 출력 -> name, java, web은 같은 클래스 안에 있기 때문에 output 메소드에서도 값을 받아들일 수 있다.
				}
			} else if (menu == 4) {
				Input01 std = new Input01(); // input 객체 선언
				System.out.println("삭제할 학생의 이름을 입력하세요");
				String inputName = sc.next(); // ArrayList<input> student 의 name의 값과 비교할 이름을 입력한다.
				boolean delete = false; // find라는 boolean형 변수 생성
				for (int i = 0; i < student.size(); i++) { 
					if(inputName.equals(student.get(i).name)) {
						delete = true; // inputName이 student의 배열중에 하나라도 일치하는 것이 있다면 find는 true이다.
						student.remove(i);
						// 입력된 학생의 값이 ArrayList<input> student 안에 있는 name의 값과 일치할 때까지 student의 배열 갯수만큼 반복해서 비교한다.						
						System.out.println(inputName + "의 정보가 삭제되었습니다.");
					}
				}
				if(!delete) { // 만약 find가 false라면 for문을 탈출하여 아래 문구를 출력한다.
					System.out.println("삭제할 정보의 학생이 없습니다.");
				}
			} else if (menu == 5) {
				System.out.println("종료");
				isRun = false;
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}
}

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputType studentInfo = new InputType(); // inputType 클래스 객체 생성
		studentInfo.menu(); // inputType의 menu메소드 호출
	}
}
