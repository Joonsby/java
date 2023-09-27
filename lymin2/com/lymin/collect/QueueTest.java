package com.lymin.collect;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new LinkedList(); // ť�� LinkedList�� �����ؼ� ����մϴ�.

		queue.offer(new Custom("chulsu", "lsu")); // ����.
		queue.offer(new Custom("sujin", "ksj"));
		queue.offer(new Custom("haejin", "phj"));

		while (!queue.isEmpty()) {// ť�� ������� Ȯ�� �ϰ� ��� ���� ������.
			Custom custom = (Custom) queue.poll();
//			Custom custom = (Custom) queue.peek();// �� ó�� �� �� ���(������ ����.. ���� ����)
			System.out.println("Custom name value is [" + custom.name + "]");
		}

	}

}
