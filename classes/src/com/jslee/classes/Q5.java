package com.jslee.classes;

import java.util.Scanner;

class GradeResult {
	String Grade, name;
	int java, html, jsp, sum, average;
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GradeResult result = new GradeResult();

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + "번째 학생 입니다.\n");
			System.out.println("학번을 입력해주세요.");
			String grade = sc.nextLine();
			System.out.println("학번은 [" + grade + "] 입니다.\n");

			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			System.out.println("이름은 [" + name + "] 입니다 \n");

			System.out.println("java의 성적을 입력해주세요.");
			int java = sc.nextInt();

			System.out.println("html의 성적을 입력해주세요.");
			int html = sc.nextInt();

			System.out.println("jsp의 성적을 입력해주세요.");
			int jsp = sc.nextInt();

			int result1 = java + html + jsp;
			System.out.println("성적의 총합은 " + result1 + "점 입니다.");

			int average = result1 / 3;
			System.out.println("성적의 평균은 " + average + "점 입니다.\n");
		}

	}

}
