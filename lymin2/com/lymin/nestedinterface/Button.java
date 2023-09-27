package com.lymin.nestedinterface;

public class Button {
	OnClickListener clickListener; // �Ʒ����� �������̽��� �ʵ忡 ���� �մϴ�.
		
	
	/**
	 * @param clickListener the clickListener to set
	 */
	public void setClickListener(OnClickListener clickListener) { // Setter �ڵ� �ϼ����� �߰��մϴ�.
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}
	
	void onTouch() {
		clickListener.onClick(); // interface�� imple�� ����Ǿ� �����Ƿ� ȣ�� ���� �մϴ�.
	}


	interface OnClickListener {
		void onClick();
	}

}
