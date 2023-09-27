package com.lymin.collect;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("jane", 100); // 키 값과 실제값 넣음.
		map.put("suji", 90);
		map.put("minsu", 80);

		System.out.println("map size is [" + map.size() + "]");
		System.out.println("map.get(key) value is [" + map.get("suji") + "]"); // 키 값으로 출력함.
		System.out.println("------------------------------");
		
		// HashMap의 전체 값을 가져 오는 방법 시작/////////////
		Set set = map.keySet(); // Set: 저장순서가 유지 되지 않는 컬렉션(집합). 여기에 HashMap의 키를 모조리 넣는다.
		Iterator iterator = set.iterator(); // 반복자에 set 반복자를 넣는다.
		while (iterator.hasNext()) { // 반복자가 다음이 있을 때 까지(자동으로 hasNext가 연산 리턴값 true, false)
			String key = (String) iterator.next(); // 반복자를 통해서 키를 하나씩 얻고 그 키 값으로 value를 얻는다.
			Integer value = (Integer) map.get(key); // 키를 넣어 값을 Integer형으로 캐스팅 한다.
			System.out.println("key value is [" + key + "]" + " real value is [" + value + "]");
		}
		System.out.println("------------------------------");

		map.remove("jane"); // jane이라는 키로 제거..
		System.out.println("02 map size is [" + map.size() + "]"); // 제거후 개수 출력.

	}

}
