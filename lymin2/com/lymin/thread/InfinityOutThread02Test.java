package com.lymin.thread;

public class InfinityOutThread02Test {
	public static void main(String[] args) {
		InfinityOut02 infinityOut02 = new InfinityOut02();
		infinityOut02.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		infinityOut02.interrupt(); // �� sleep�� �Բ� ��� �߻�.. (����ä�� exception�� �߻� �Ǹ鼭 ���߰� �մϴ�.)

	}

}