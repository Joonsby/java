package com.lymin.thread;

public class ImplThread03Test {
	public static void main(String[] args) {
		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start(); // 재정의된 run 실행.

		for (int j = 0; j < 10; j++) { //
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 이 위치에 Thread를 넣으면, 위의 메인 Thread에서 Second Task가 모두 수행 되고,
		// Third Task가 실행 됩니다.
		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();

	}

}
