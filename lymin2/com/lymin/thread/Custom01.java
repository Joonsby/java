package com.lymin.thread;

public class Custom01 extends Thread {
	private BankSaveMachine bankSaveMachine;

	/**
	 * @param bankSaveMachine the bankSaveMachine to set
	 */
	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankSaveMachine.setMoney(200); // �ѱݾ��� 200������ ����
	}
	

}
