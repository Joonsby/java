package com.lymin.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn(); // �ʵ� ����
		anonymous.fieldRemoConEx.setOff(); // �ʵ� ����
		
		anonymous.method01(); // ���� ������ ����.
		
		anonymous.method02(new RemoConEx() { // �Ű������� �ѱ�鼭 ������ �ϴ� ���Դϴ�. 
			//�� ���� Ŭ�������� ������ �ϰ� ���� ��쿡 ��� �մϴ�.
			
			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is setOn");
				
			}
			
			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("AirCon is setOn");
				
			}
		});
		
		
	}
}
