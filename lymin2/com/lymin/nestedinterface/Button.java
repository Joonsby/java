package com.lymin.nestedinterface;

public class Button {
	OnClickListener clickListener; // 아래만든 인터페이스를 필드에 선언 합니다.
		
	
	/**
	 * @param clickListener the clickListener to set
	 */
	public void setClickListener(OnClickListener clickListener) { // Setter 자동 완성으로 추가합니다.
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}
	
	void onTouch() {
		clickListener.onClick(); // interface와 imple이 연결되어 있으므로 호출 가능 합니다.
	}


	interface OnClickListener {
		void onClick();
	}

}
