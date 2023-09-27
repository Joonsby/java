package com.lymin.nestedinterface;

public class Anonymous {
	RemoConEx fieldRemoConEx = new RemoConEx() { // 필드 초기값으로  필드에 재정의 합니다.

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
	
	void method01 () { // 로컬 변수값으로...로컬 변수 아래에서 재정의 되었습니다.
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
		localRemoConEx.setOn(); // 로컬 변수의 사용..
		
	}
	
	void method02(RemoConEx remoConEx) { // interface를 매개 변수로 받을 수 있는 메소드로 정의 되었습니다.
		remoConEx.setOn();
	}
	
}
