package com.lymin.collect;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new LinkedList(); // 큐는 LinkedList를 생성해서 사용합니다.

		queue.offer(new Custom("chulsu", "lsu")); // 저장.
		queue.offer(new Custom("sujin", "ksj"));
		queue.offer(new Custom("haejin", "phj"));

		while (!queue.isEmpty()) {// 큐가 비었는지 확인 하고 계속 루프 돌린다.
			Custom custom = (Custom) queue.poll();
//			Custom custom = (Custom) queue.peek();// 맨 처음 들어간 것 출력(지우지 않음.. 무한 루프)
			System.out.println("Custom name value is [" + custom.name + "]");
		}

	}

}
