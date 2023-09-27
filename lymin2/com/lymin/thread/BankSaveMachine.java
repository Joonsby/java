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
//			Thread.sleep(3000); // ������ �ٻ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�. ����մϴ�. (�� ��� �ð��߿� �ٸ� �������� �ͼ� �ѱݾ��� �����մϴ�.)
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
//			Thread.sleep(3000); // ������ �ٻ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�. ����մϴ�. (�� ��� �ð��߿� �ٸ� �������� �ͼ� �ѱݾ��� �����մϴ�.)
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
				Thread.sleep(3000); // ������ �ٻ��� 3�ʰ��� ó���ð��� �ʿ��մϴ�. ����մϴ�. (�� ��� �ð��߿� �ٸ� �������� �ͼ� �ѱݾ��� �����մϴ�.)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("BankSaveMachine money value is [" + this.money + "]");
		}

	}

}
