package com.lymin.nestedinterface;

public class Anonymous {
	RemoConEx fieldRemoConEx = new RemoConEx() { // �ʵ� �ʱⰪ����  �ʵ忡 ������ �մϴ�.

		@Override
		public void setOn() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous field TV Set On");
		}

		public void setOff() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous field TV Set Off");

		}
	};
	
	void method01 () { // ���� ����������...���� ���� �Ʒ����� ������ �Ǿ����ϴ�.
		RemoConEx localRemoConEx = new RemoConEx() {
			
			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set On");
				
			}
			
			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set Off");
				
			}
		};
		localRemoConEx.setOn(); // ���� ������ ���..
		
	}
	
	void method02(RemoConEx remoConEx) { // interface�� �Ű� ������ ���� �� �ִ� �޼ҵ�� ���� �Ǿ����ϴ�.
		remoConEx.setOn();
	}
	
}
