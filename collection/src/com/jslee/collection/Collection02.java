package com.jslee.collection;

// https://docs.oracle.com/javase/8/docs/api/index.html api를 통해서 Collection을 찾는 것이 중요하다.

import java.util.ArrayList;
import java.util.Collections;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(10); // 갯수가 10개인 Collection 배열 생성
		list1.add(5); // 첫번째 요소
		list1.add(2); // 두번째 요소
		list1.add(1); // 세번째 요소
		list1.add(4); // 네번째 요소
		list1.add(0); // 다섯번째 요소
		list1.add(3); // 여섯번째 요소
		// list1.add("test") Collection에 type을 지정하지 않으면  "test"를 추가하는 것도 가능하지만 권장되는 사항은 아니다.
		// ArrayList list1 = new ArrayList(10);
		// add로 배열의 갯수가 늘어나도 알아서 공간을 늘려서 배열의 갯수를 늘린다.
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1의 첫번째와 네번째 사이의 목록을 리턴 (보통 4전까지 리턴)
		print(list1,list2); // method print 실행
		
		Collections.sort(list1); // sort 숫자의 크기에 따라 정렬
		Collections.sort(list2); // list2 는 첫번째와 네번째 사이의 목록을 숫자의 크기에 따라 정렬
		print(list1,list2); // method print 실행
		
		System.out.println("list1.containsAll(list2)" + list1.containsAll(list2));
		// Arraylist에는 containsAll이 없고 그 부모인 AbstractList에도 없고 그 부모인 AbstractCollection에 containsAll이 있다.
		// containsAll은 list1에 list2가 모두 포함되어 있는지를 boolean 형태로 판별하는 것이다.
		// list2 [1, 2, 4]는 list1 [0, 1, 2, 3, 4, 5]에 모두 포함되어 있기 때문에 true이다. 
		
		list2.add("B"); // list2 가장 뒤에 "B"를 추가한다.
		list2.add("C"); // list2 가장 뒤에 "C"를 추가한다. -> "B" 뒤에 "C"가 오게된다.
		list2.add(3,"A"); // list2의 세번째 자리에 "A"를 추가한다.(메소드 오버로딩) add는 숫자든 문자든 집어넣는 것이 가능하다.
		print(list1,list2); // method print 실행
		
		list2.set(3,"AA"); // list2 의 세번째 자리에 있는 값을 "AA"로 대체한다.
		print(list1,list2); // method print 실행
		
		System.out.println("list1,retainAll(list2)" + list1.retainAll(list2));
		// list1과 list2의 공통 요소를 제외한 나머지를 모두 제거한다. 
		print(list1,list2); // list1과 list2의 공통부분인 [1,2,4]을 제외한 나머지 부분은 제외하고 list1이 출력된다.
		
		for (int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) { // get : list의 i번째에 있는 요소를 리턴한다.
				list2.remove(i); // remove : i번째에 있는 요소를 제거한다.
			}
		}
		// 아래에 있는 문장을 for문으로 표현한 것이다.
		
		/*
		if(list1.contains(list2.get(5))) { // list1이 list2의 5번째에 있는 요소를 포함하고 있으면
			list2.remove(5);			   // list2의 5번째 요소를 제거한다.list1은 ("C")를 포함하고 있지 않기 때문에 제거되지 않는다
		}
		if(list1.contains(list2.get(4))) { // list1이 list2의 4번째에 있는 요소를 포함하고 있으면
			list2.remove(4);			   // list2의 4번째 요소를 제거한다.list1은 ("B")를 포함하고 있지 않기 때문에 제거되지 않는다
		}
		if(list1.contains(list2.get(3))) { // list1이 list2의 3번째에 있는 요소를 포함하고 있으면
			list2.remove(3);			   // list2의 3번째 요소를 제거한다.list1은 ("AA")를 포함하고 있지 않기 때문에 제거되지 않는다
		}
		if(list1.contains(list2.get(2))) { // list1이 list2의 2번째에 있는 요소를 포함하고 있으면
			list2.remove(2);			   // list2의 2번째 요소를 제거한다.list1은 ("4")를 포함하고 있기 때문에 제거한다.
		}
		if(list1.contains(list2.get(1))) { // list1이 list2의 1번째에 있는 요소를 포함하고 있으면
			list2.remove(1);			   // list2의 1번째 요소를 제거한다.list1은 ("2")를 포함하고 있기 때문에 제거한다.
		}
		if(list1.contains(list2.get(0))) { // list1이 list2의 4번째에 있는 요소를 포함하고 있으면
			list2.remove(0);			   // list2의 4번째 요소를 제거한다.list1은 ("1")를 포함하고 있기 때문에 제거한다.
		}
		*/

		print(list1,list2); // method print 실행
	}
	static void print(ArrayList list1, ArrayList list2) { // print method 객체형 매개변수 2개
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
	}

}
