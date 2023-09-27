package com.lymin.thread;

public class BankSaveMachine {
	private int money;

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
//	public void setMoney(int money) {
//		this.money = money;
//
//		System.out.println("BankSaveMachine money value is [" + this.money + "]");
//	}

//	public void setMoney(int money) {
//		this.money = money;
//		
//		try {
//			Thread.sleep(3000); // 은행이 바뻐서 3초간의 처리시간이 필요합니다. 대기합니다. (이 대기 시간중에 다른 누군가가 와서 총금액을 변경합니다.)
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("BankSaveMachine money value is ["+this.money+"]");
//	}

//	public synchronized void setMoney(int money) {
//		this.money = money;
//		
//		try {
//			Thread.sleep(3000); // 은행이 바뻐서 3초간의 처리시간이 필요합니다. 대기합니다. (이 대기 시간중에 다른 누군가가 와서 총금액을 변경합니다.)
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("BankSaveMachine money value is ["+this.money+"]");
//	}

	public void setMoney(int money) {
		synchronized (this) {
			this.money = money;

			try {
				Thread.sleep(3000); // 은행이 바뻐서 3초간의 처리시간이 필요합니다. 대기합니다. (이 대기 시간중에 다른 누군가가 와서 총금액을 변경합니다.)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("BankSaveMachine money value is [" + this.money + "]");
		}

	}

}
