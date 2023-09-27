package com.lymin.thread;

public class InfinityOutThreadTest {
	public static void main(String[] args) {
		InfinityOut infinityOut = new InfinityOut();
		infinityOut.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		infinityOut.setStop(true); // 2초 뒤에 쓰레드 실행 Flag 값을 변경하여 줍니다.
		
	}

}
