package com.lymin.thread;

public class Custom02 extends Thread {
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
		bankSaveMachine.setMoney(100); // // �ѱݾ��� 100������ ����
	}
	

}