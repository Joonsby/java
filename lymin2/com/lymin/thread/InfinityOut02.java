package com.lymin.thread;

public class InfinityOut02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) { // ���� �ݺ� �˴ϴ�.
				System.out.println("--------Inifinity 02 String out!-----------");
				Thread.sleep(1); // �� interrupt�� ���ٸ� sleep�� �ؾ� ��.
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
//			e.printStackTrace(); // interrupt�� exception�� �߻� �Ǿ����� Ȯ�� �� ���ϴ�.
			System.out.println("------InterruptedException-----------");
		}
		System.out.println("------------02....end----------");

	}

}
