package com.lymin.thread;

public class InfinityOut extends Thread {
	private boolean isStop = false;

	/**
	 * @return the isStop
	 */
	public boolean isStop() {
		return isStop;
	}

	/**
	 * @param isStop the isStop to set
	 */
	public void setStop(boolean isStop) {
		this.isStop = isStop;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!isStop) {
			System.out.println("--------Inifinity String out!-----------");
		}
		System.out.println("------------end----------");

	}

}
