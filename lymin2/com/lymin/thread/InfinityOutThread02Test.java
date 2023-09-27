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
		infinityOut02.interrupt(); // 꼭 sleep과 함께 써야 발생.. (가로채어 exception이 발생 되면서 멈추게 합니다.)

	}

}
