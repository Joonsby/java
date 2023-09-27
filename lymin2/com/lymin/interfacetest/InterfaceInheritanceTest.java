package com.lymin.interfacetest;

public class InterfaceInheritanceTest {
	public static void main(String[] args) {
		InputDeviceImpl inputDeviceImpl = new InputDeviceImpl(); // �� ������ Ŭ������ ����
		
		PhysicalButton physicalButton = inputDeviceImpl; // �������̽��� �󼼱����� instance�� �ֽ��ϴ�.
		physicalButton.keyPressed(); // �ڽ��� class�� ���ǵ� �߻� �޼ҵ常 ȣ�� ����
		
		ScreenTouch screenTouch = inputDeviceImpl; // �������̽��� �󼼱����� instance�� �ֽ��ϴ�.
		screenTouch.onTouch(); // �ڽ��� class�� ���ǵ� �߻� �޼ҵ常 ȣ�� ����
		
		System.out.println("====================================");
		
		InputDevice inputDevice = inputDeviceImpl; // ���߻���� InputDevice�� �� ������ Ŭ������ �ֽ��ϴ�.
		//////////�Ʒ�, ��� ���� �ΰ��� �޼ҵ�� �ڽ��� �߻� �޼ҵ� ��� ȣ�� ����////////
		inputDevice.keyPressed(); 
		inputDevice.onTouch();
		inputDevice.alertError();
		
		inputDevice.onSound(); // ���� �߰��� �������̽��� ������ Ȯ�� �մϴ�.
		
	}

}
