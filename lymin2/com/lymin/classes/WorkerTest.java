package com.lymin.classes;

public class WorkerTest {
	public static void main(String[] args) {
		System.out.println("----------------Object New----- Start------------");
		Worker worker = new Worker(); // 이렇게 new로 생성하면 객체가 생성된 것입니다.
		// 생성후 worker라는 변수에 담아 두었습니다.
		
		Worker workerTwo = new Worker(); // 두번째 객체를 만들었습니다.
		System.out.println("worker 와 workerTwo는 서로 각기 다른 객체 입니다.");
		
		System.out.println("----------------Object New----- end------------");
		
	}

}
