package com.lymin.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setClickListener(new MessageListener()); // Setter�� Ŭ���� ���� �������̽��� �� ���� ��ü�� ������ �ݴϴ�.
		button.onTouch(); // ���� ȣ���ϸ� �� ������ �κ��� ���� �˴ϴ�.

	}

}
