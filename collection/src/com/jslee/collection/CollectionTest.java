package com.jslee.collection;

import java.util.ArrayList;
import java.util.Scanner;

class inputTest { // inputTest Class 생성
	String name;
	int java, web;
	Scanner sc = new Scanner(System.in);

	void menu() {
		ArrayList<String> name = new ArrayList<String>(); // 이름을 받아올 객체 변수 생성 ArrayList = 제네릭 타입
		ArrayList<Integer> java = new ArrayList<Integer>(); // java성적을 받아올 객체 변수 생성
		ArrayList<Integer> web = new ArrayList<Integer>(); // web성적을 받아올 객체 변수 생성
		
		boolean isRun = true; // while문을 실행시키기 위한 변수 생성

		while (isRun) { // isRun이 false값이 될때까지 반복문 실행 
			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("1.성적입력 \n2.성적출력 \n3.성적전체출력 \n4.정보삭제 \n5.종료");
			int menu = sc.nextInt(); // 받아온 입력값으로 메뉴 선택
			switch (menu) { // 받아온 입력값으로 switch문 생성
			case 1:
				System.out.println("1.성적입력");
				System.out.println("이름을 입력하세요.");
				String name01 = sc.next(); // 받아온 이름을 name01 변수로 생성
				name.add(name01); // 받아온 name01 값을 String 타입의 name 객체 변수에 대입
				System.out.println("java 성적을 입력하세요.");
				int java01 = sc.nextInt(); 
				java.add(java01); // 받아온 java01 값을 Integer 타입의 java 객체 변수에 대입
				System.out.println("web 성적을 입력하세요.");
				int web01 = sc.nextInt();
				web.add(web01); // 받아온 web01 값을 Integer 타입의 web 객체 변수에 대입
				break;
			case 2:
				System.out.println("2.성적출력");
				System.out.println("몇 번째 학생인지 입력하세요.");
				int i = sc.nextInt();
				String studentName = name.get(i - 1);
				Integer javaResult = java.get(i - 1);
				Integer webResult = web.get(i - 1);
				System.out.println(i + "번째 학생의 이름과 java성적과 web성적은 각각 " + studentName + ", " + javaResult + ", "
						+ webResult + "입니다.");
				System.out.println();
				break;
			case 3:
				for (int j = 0; j < name.size(); j++) {
					System.out.println((j + 1) + "번째 학생의 이름과 java성적과 web성적은 각각 " + name.get(j) + ", " + java.get(j)
							+ ", " + web.get(j) + "입니다.");
				}
				break;
			case 4:
				System.out.println("4.정보삭제");
				System.out.println("삭제할 학생의 번호를 입력하세요.");
				int k = sc.nextInt();
				name.remove(k-1);
				java.remove(k-1);
				web.remove(k-1);
				System.out.println(k + "번째 학생의 정보가 삭제 되었습니다.");
				break;
			case 5:
				System.out.println("종료");
				isRun = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
	}
}

public class CollectionTest {

	public static void main(String[] args) {

		inputTest studentInfo = new inputTest(); // inputTest 클래스 객체 생성
		studentInfo.menu(); // inputTest 안에 있는 menu method 호출

		/*
		 * 프로그램 시작 1.성적입력 Scanner inputTest{ String name; int java,web;
		 * 
		 * } 2.성적출력 System.out.println(); printTest{} 3.성적전체출력 printAllTest{} 4.정보삭제
		 * classdeleteTest{} 5.종료 exit{} 원하는 메뉴를 선택하세요. 5번을 누르지 않으면 프로그램이 종료되지 않는다.
		 * 
		 * 1 아이디, java, web 점수 입력
		 * 
		 * 1.성적입력 2.성적출력 3.성적전체출력 4.정보삭제 5.종료 원하는 메뉴를 선택하세요.
		 * 
		 * 1 아이디, java, web 점수 입력
		 * 
		 * 3 1.성적입력 2.성적출력 3.성적전체출력 4.정보삭제 5.종료 원하는 메뉴를 선택하세요. 두명의 정보가 화면에 나와야 한다.
		 * 
		 * 2 출력하고자하는 학생의 아이디를 입력하세요. 만약 없다면 없습니다.
		 * 
		 */
	}

}
