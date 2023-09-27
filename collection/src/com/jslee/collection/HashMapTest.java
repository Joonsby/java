package com.jslee.collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class input {
	Scanner sc = new Scanner(System.in);
	String name;
	int javaScore, webScore;

	void input() {
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("java 성적을 입력하세요");
		javaScore = sc.nextInt();
		System.out.println("web 성적을 입력하세요");
		webScore = sc.nextInt();
	}
}

class print {
	HashMap<String, input> studentInfo = new HashMap<String, input>();
	Scanner sc = new Scanner(System.in);
	boolean select = true;
	boolean isTrue = false;

	print() {
		while (select) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("3.성적 전체 출력");
			System.out.println("4.성적 삭제");
			System.out.println("5.종료");
			int menuSelect = sc.nextInt();
			switch (menuSelect) {
			case 1: {
				input std = new input();
				std.input();
				studentInfo.put(std.name, std);
				System.out.println("[" + std.name + "]의 학생 정보가 저장되었습니다.");
				break;
			}
			case 2: {
				System.out.println("성적을 조회할 학생의 이름을 입력하세요.");

				boolean isTrue = false;
				String searchStudentName = sc.next();
				if (studentInfo.containsKey(searchStudentName)) {
					isTrue = true;
					input student = studentInfo.get(searchStudentName);
					System.out.println("조회한 학생의 이름은 [" + student.name + "] 입니다.");
					System.out.println("조회한 학생의 java 성적은 [" + student.javaScore + "] 입니다.");
					System.out.println("조회한 학생의 web 성적은 [" + student.webScore + "] 입니다.");
				}
				if (!isTrue) {
					System.out.println(searchStudentName + "의 학생 정보가 없습니다.");
				}
				break;
			}
			case 3: {
				System.out.println("성적 전체 출력");
				Set<String> keys = studentInfo.keySet();
				for (String key : keys) {
					isTrue = true;
					input student = studentInfo.get(key);
					System.out.println("학생의 이름은 [" + student.name + "] 입니다.");
					System.out.println("학생의 java성적은 [" + student.javaScore + "] 입니다.");
					System.out.println("학생의 web성적은 [" + student.webScore + "] 입니다.");
					System.out.println("------------------");
				}
				if (!isTrue) {
					System.out.println("출력할 학생의 정보가 없습니다.");
				}
				break;
			}
			case 4: {

				System.out.println("삭제할 학생의 이름을 입력하세요.");
				String deleteStudent = sc.next();
				isTrue = false;
				for (int i = 0; i < studentInfo.size(); i++) {
					if (studentInfo.containsKey(deleteStudent)) {
						isTrue = true;
						studentInfo.remove(deleteStudent);
						System.out.println(deleteStudent + "의 정보가 삭제되었습니다.");
					}
				}
				if (!isTrue) {
					System.out.println(deleteStudent + "의 학생 정보가 없습니다");
				}
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				select = false;
			}
			default: {
				System.out.println("메뉴를 1~5번 중에서 다시 선택해주세요.");
			}
			}
		}
	}
}

public class HashMapTest {

	public static void main(String[] args) {
		new print();		
	}
}
