package com.lymin.thread;

public class FirstTask implements Runnable { // imple Ű���带  ����մϴ�.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(500);// 0.5 �� �ڿ� �ٽ� ����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
