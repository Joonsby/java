package com.lymin.thread;

public class FirstTaskEx extends Thread {

	@Override
	public void run() { // ������ �մϴ�.
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("First Task Ex");
			try {
				Thread.sleep(500);// 0.5 �� �ڿ� �ٽ� ����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
