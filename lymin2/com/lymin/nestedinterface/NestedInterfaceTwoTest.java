package com.lymin.nestedinterface;

public class NestedInterfaceTwoTest {

	public static void main(String[] args) {
		Button button = new Button();
		button.setClickListener(new MessageListener()); // Setter�� Ŭ���� ���� �������̽��� �� ���� ��ü�� ������ �ݴϴ�.
		button.onTouch(); // ���� ȣ���ϸ� �� ������ �κ��� ���� �˴ϴ�.

		button.setClickListener(new PushListener()); // ���� �߰��� Class �� ������ Setter�� �ֽ��ϴ�.
		button.onTouch(); // ���� Ȯ��.
	}

}
