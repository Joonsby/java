package com.lymin.thread;

public class InfinityNumOutThreadTest {
	public static void main(String[] args) {
		InfinityNumOut infinityNumOut = new InfinityNumOut();
		infinityNumOut.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (infinityNumOut.getCounter() > 99) {
			infinityNumOut.setStop(true);
		}

	}

}
