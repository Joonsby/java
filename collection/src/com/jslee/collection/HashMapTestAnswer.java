package com.jslee.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class input2 {	
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

class InputType2 {
//	ArrayList<input> student = new ArrayList<input>(); // 객체 배열 생성 input 클래스 가져옴
	HashMap<String, input2> student = new HashMap<String, input2>(); // HashMap 객체 생성
	// HashMap<String, 성적관리> student = new HashMap<String, 성적관리>();
	Scanner sc = new Scanner(System.in);
	void menu() {
		boolean isRun = true;
		while (isRun) {
			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("1.성적입력 \n2.성적출력 \n3.성적전체출력 \n4.정보삭제 \n5.종료");
			int menu = sc.nextInt(); // 메뉴를 선택할 값을 받아옴
			if (menu == 1) {
				input2 std = new input2(); // input 객체 선언
				std.input(); // input 클래스 안에 있는 input 메소드 호출
				student.put(std.name, std); // ArrayList<input> 객체 배열 안에 std값을 추가함
//				student.put(std.name,std.java);
//				student.put(key값,학생성적); // ArrayList<input> 객체 배열 안에 std값을 추가함
			} else if (menu == 2) {
				// if(입력키값.containsKey()){
				// 성적관리 학생 = new 성적관리();
				// 학생 = std.get(str);
				// System.out.println("key = %s => value = %d%n, str, i);
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
				input2 std = new input2(); // input 객체 선언
				System.out.println("출력할 학생의 이름을 입력하세요");
				String inputName = sc.next(); // ArrayList<input> student 의 name의 값과 비교할 이름을 입력한다.	
				boolean find = false; // find라는 boolean형 변수 생성				
					if(student.containsKey(inputName)) {
						find = true;
						// inputName이 student의 배열중에 하나라도 일치하는 것이 있다면 find는 true이다.
						// 입력된 학생의 값이 ArrayList<input> student 안에 있는 name의 값과 일치할 때까지 student의 배열 갯수만큼 반복해서 비교한다.
						// 일치한다면 일치하는 순서의 배열을 가져온다.
						student.get(inputName); // student의 i번재에 있는 배열을 가져온다 
						std.output(); // input 클래스에 있는 output 메소드 출력					
				}
				if (!find) { // 만약 find가 false라면 for문을 탈출하여 아래 문구를 출력한다. 
					System.out.println("입력한 정보의 학생이 없습니다.");
				}
			} else if (menu == 3) { // key값을 뽑아서 와야된다.
				Set<String> s = student.keySet(); // key값들을 리턴하겠다는 뜻이다. 리턴한 key값들을 s에 저장했다. <K(Key)>이기 때문에 String을 넣어줘야 된다.
				for(String str : s) { // key가 가지고 있는 만큼 반복 시키겠다는 개선된 for문
					input2 i = student.get(str); // 지정한 키가 매핑된 값을 리턴하거나, 이 맵에 키에 대한 매핑이 없는 경우 null을 리턴한다.
					// hash.get() 안에는 key값을 입력해야 한다. 입력한 key값이 존재하지 않는다면 null을 리턴한다.
					System.out.printf("key = %s => value = %d%n", str, i); // str(key)와 i(value)를 함께 출력하겠다는 뜻이다.		
				}
			} else if (menu == 4) {
				input std = new input(); // input 객체 선언
				System.out.println("삭제할 학생의 이름을 입력하세요");
				String inputName = sc.next(); // ArrayList<input> student 의 name의 값과 비교할 이름을 입력한다.
				boolean delete = false; // find라는 boolean형 변수 생성
				for (int i = 0; i < student.size(); i++) { 
					if(student.containsKey(inputName)) {
						delete = true; // inputName이 student의 배열중에 하나라도 일치하는 것이 있다면 find는 true이다.
						student.remove(inputName);
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

public class HashMapTestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputType2 studentInfo = new InputType2(); // inputType 클래스 객체 생성
		studentInfo.menu(); // inputType의 menu메소드 호출
	}
}
