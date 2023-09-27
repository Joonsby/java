package com.lymin.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setClickListener(new MessageListener()); // Setter로 클래스 하위 인터페이스에 상세 구현 객체를 설정해 줍니다.
		button.onTouch(); // 이제 호출하면 상세 구현된 부분이 수행 됩니다.

	}

}
