package com.lymin.thread;

public class InfinityNumOut02 extends Thread {
	private int counter = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) {
				this.counter++;
				System.out.println("Infinity Counter value is [" + this.counter + "]");
				Thread.sleep(1);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("-----------end----------------");

	}

	/**
	 * @return the counter
	 */
	public int getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

}