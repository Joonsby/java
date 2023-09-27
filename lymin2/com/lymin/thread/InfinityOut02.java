package com.lymin.thread;

public class InfinityOut02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) { // 무한 반복 됩니다.
				System.out.println("--------Inifinity 02 String out!-----------");
				Thread.sleep(1); // 꼭 interrupt를 쓴다면 sleep을 해야 함.
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
//			e.printStackTrace(); // interrupt로 exception이 발생 되었는지 확인 해 봅니다.
			System.out.println("------InterruptedException-----------");
		}
		System.out.println("------------02....end----------");

	}

}
