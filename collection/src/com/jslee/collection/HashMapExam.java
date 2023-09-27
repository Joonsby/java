package com.jslee.collection;

import java.util.HashMap;
// map은 순서라는 개념이 아예 없기 때문에 데이터를 찾을때도 순서에 상관없이 무작위로 추출하게 된다.
// 따라서 자료를 검색할 때 훨씬 더 빨리 찾을 수 있다.
import java.util.Set;

class HashMapExam extends HashMap<String, Integer>{ // HashMap을 상속 받을때 <> Generic type도 형태에 맞게 입력해줘야 한다.
	public HashMapExam() { // 생성자 생성 return (X) parameter (X)
//		super(); 원래는 생략 가능하지만 api상으로 원하는 호출 형태로 맞춰줘야 한다.
//		HashMap<String, Integer> hash = new HashMap<String, Integer>();	// 명시된 초기의 용량으로 비어 있는 HaspMap을 건설하고 요소들을 가져온다.
		// 자식은 생성자를 호출시 반드시 부모를 반드시 불러야 한다.
		// HashMap(Map<? extends K,? extends V> m) K는 Key, V는 Value
		// key는 요소들의 이름이라고 생각하면 된다.(naming)
		// key는 자료의 이름이기 때문에 Value값이 어떻든 간에 무조건 String 구조이어야 한다.
		// key값은 구분할 수 있기 위해서 중복이 되면 안된다.
		/*super.*/put("a", 10); // 이 맵안에 있는 명시된 value와 key를 결합시킨다. // 부모의 값에 저장을 해야되기 때문에 super를 사용한다.
		// 어차피 부모로부터 상속받은 것은 나의 것이기 때문에 super는 default로 들어가 있기 때문에 super를 생략하는 것도 가능하다.
		/*super.*/put("b", 20); // put은 데이터를 순서대로 집어 넣는 것이 아니라 무작위로 데이터를 배치한다.
		/*super.*/put("c", 30); // hash.put은 순차적으로 데이터가 저장된 것이 아니라 무작위로 저장된 것이다.
		// 순차적으로 데이터를 추출할 것이면 ArrayList구조를 사용해야 하지만 자료간의 순서가 존재하지 않는다면 HashMap구조를 사용하면 된다.
		
		System.out.println("size = " + size());
		
		Set<String> s = /*HaspMap변수명.*/keySet(); // key값들을 리턴하겠다는 뜻이다. 리턴한 key값들을 s에 저장했다. <K(Key)>이기 때문에 String을 넣어줘야 된다.
		for(String str : s) { // key가 가지고 있는 만큼 반복 시키겠다는 개선된 for문
			int i = get(str); // 지정한 키가 매핑된 값을 리턴하거나, 이 맵에 키에 대한 매핑이 없는 경우 null을 리턴한다.
			// hash.get() 안에는 key값을 입력해야 한다. 입력한 key값이 존재하지 않는다면 null을 리턴한다.
			System.out.printf("key = %s => value = %d%n", str, i); // str(key)와 i(value)를 함께 출력하겠다는 뜻이다.
			// %s 문자열출력
			// %d 정수형 출력
			// %n 줄바꿈
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HashMapExam(); // 객체가 만들어짐과 동시에 생성자가 생성된다.
	}

}
