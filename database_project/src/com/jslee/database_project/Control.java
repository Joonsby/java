package com.jslee.database_project;

import java.util.Scanner;

public class Control {
	public Control(){
		Menu menu = new Menu();
		DataControl dataControl = new DataControl();
		Scanner sc = new Scanner(System.in);
		String name;
		boolean select = true;
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
				menu.input();
				break;
			}
			case 2: {
				// 테이블 안의 특정 값을 뽑아내는 방법 select from t where id = 'b';
				// id가 'b'인 값을 뽑아 내는 것이다. 중복되는 정보가 있는 경우 해당되는 모든 정보를 다 가져온다.
				// 유일하게 select만 executeQuery를 사용한다.
				// executeQuery와 executeUpdate를 함께 사용할 수 없다.(한번에 한번씩 사용)
				System.out.println("출력을 원하는 학생의 이름을 입력하세요.");
				name = sc.next();			
				dataControl.print(name);
				break;
			}
			case 3: {			
				menu.printAll();
				break;
			}
			case 4: {
				// 테이블 안의 레코드를 삭제 하는 방법 delete from table명 where id='a';
				// delete from table명을 사용하면 table 전체가 지워진다.
				// id에 a의 값만 지운다는 뜻이다.
				System.out.println("삭제할 학생의 이름을 입력하세요.");
				name = sc.next();			
				dataControl.delete(name);			
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				select = false;
				break;
			}
			default: {
				System.out.println("메뉴를 1~5번 중에서 다시 선택해주세요.");
			}
		}
		sc.close();
	}
}
}
