package com.lymin.classes;

public class DrawUtilTest {
	public static void main(String[] args) {
		DrawUtil.getInstance(); // 1회 생성
		DrawUtil.getInstance().drawRect();
		DrawUtil.getInstance().releaseInstance(); // 생성된 instance 삭제

		DrawUtil.getInstance(); // 다시 생성
		DrawUtil.getInstance().drawCircle();
		DrawUtil.getInstance().releaseInstance(); // 사용이 끝나면, 리소스 반환 꼭 해준다.
	}

}
