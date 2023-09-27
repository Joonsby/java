package com.jslee.database_project;

public class UserInfo {
	// 틀을 짜는 클래스
	private String name;
	private int java, web;
	// Source탭의 Generate Getters and Setters를 클릭해서 Getters 와 Setters 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}	
}
