package com.lymin.thread;

public class ImplThread03Test {
	public static void main(String[] args) {
		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start(); // �����ǵ� run ����.

		for (int j = 0; j < 10; j++) { //
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// �� ��ġ�� Thread�� ������, ���� ���� Thread���� Second Task�� ��� ���� �ǰ�,
		// Third Task�� ���� �˴ϴ�.
		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();

	}

}
