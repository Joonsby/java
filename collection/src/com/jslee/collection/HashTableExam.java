package com.jslee.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExam {
	Hashtable<String/*key*/, UserInfo/*value*/> table = new Hashtable<String, UserInfo>(); // UserInfo를 통한 객체를 생성 / 순서가 중요하지 않기 때문에 Hashtable 생성
	
	public HashTableExam() {
		UserInfo u = new UserInfo();
		// u.name = "가"; 어떤 구조를 짜도 직접적으로 접근해서 사용하는 것은 절대 불가능하다
		// u.n(); method는 public 으로 만들었으니 호출할 수 있다. u.name에 "java"를 대입한것과 같다.
		// private을 직접 가져올 수 없으니 method를 통해서 간접적으로 값을 입력하는 것이 가능하다.
		// 보통 변수들은 private일 확률이 크고 method들은 public일 확률이다 크다.
		// 어느정도의 공유와 어느정도의 open을 적절히 이용해야 한다.
		u.setName("가");
		u.setAge(20);
		u.setAddr("강남구");
		
		UserInfo u2 = new UserInfo();
		u2.setName("나");
		u2.setAge(25);
		u2.setAddr("역삼동");
		
		UserInfo u3 = new UserInfo();
		u3.setName("다");
		u3.setAge(30);
		u3.setAddr("청담동");
		
		table.put("ga",u);
		table.put("na",u2);
		table.put("da",u3);
		
		Enumeration<String> e = table.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			UserInfo value = table.get(key); // table에 있는 값을 value에 집어 넣겠다는 뜻이다.
			System.out.println(key + " = " + value);
			 // System.out.println(value.name); // name은 private이기 때문에 바로 가져오는 것은 불가능하다.
			 System.out.printf("%s, %d, %s%n", value.getName(), value.getAge(), value.getAddr());
		}		
	}
}
