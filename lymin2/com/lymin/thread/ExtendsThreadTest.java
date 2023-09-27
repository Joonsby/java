package com.lymin.thread;

public class ExtendsThreadTest {
	public static void main(String[] args) {

		Thread thread = new FirstTaskEx();
		thread.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
