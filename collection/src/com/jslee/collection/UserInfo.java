package com.jslee.collection;

public class UserInfo {
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name01) { // 위에 있는 변수와 이름을 맞췄다
		this.name = name01; // 누구를 지정하는지 헷갈릴수 있기 때문에 this(나 자신)로 지정해준다.
	}
	
	public void setAge(int age01) {
		this.age = age01;
	}
	
	public void setAddr(String addr01) {
		this.addr = addr01;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getAddr() {
		return addr;
	}
	
	// public void n() {
	//	 name = "java";
	// }
	// 보편적으로 private으로 만든다.
	// 그 누구도 아무나 접근 가능할때 public을 사용한다
	// 자식에게만 public처럼 사용할 때에만 protected를 사용한다.
	
	// public void m() {} method는 보통 public으로 통상적으로 만든다.
}
