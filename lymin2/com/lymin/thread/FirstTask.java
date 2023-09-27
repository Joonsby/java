package com.lymin.thread;

public class FirstTask implements Runnable { // imple 키워드를  사용합니다.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(500);// 0.5 초 뒤에 다시 실행.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
