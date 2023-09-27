package com.lymin.thread;

public class InfinityNumOut extends Thread{
	private boolean isStop = false;
	private int counter = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(!isStop) {
			this.counter++;
			System.out.println("Infinity Counter value is ["+this.counter+"]");
		}
		System.out.println("-------------end---------------");
	}

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
