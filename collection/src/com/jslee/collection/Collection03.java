package com.jslee.collection;

import java.util.ArrayList;

class 성적관리{
	String 이름;
	int java,html,jsp;
	int 총점;
	int 평균;
}

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(); // 컬렉션이 가지고 있는 장점은 객체를 담을 수 있다는 것이다.
		성적관리 학생1 = new 성적관리();
		학생1.이름 = "홍길동";
		학생1.java = 100;
		
		성적관리 학생2 = new 성적관리();
		학생2.이름 = "김철수";
		학생2.java = 90;
		ArrayList<성적관리> std = new ArrayList<성적관리>(5);
		std.add(학생1);
		std.add(학생2);
		
		// ~~~.sort
		std.remove(학생1);
	}

}
