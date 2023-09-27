package com.lymin.classes;

public class ConnectUtilTest {
	public static void main(String[] args) {
		ConnectUtil.getInstance().connectStockFirm(); // 생성과 메소드 호출을 한 번에 할 수 있습니다.
		ConnectUtil.getInstance().releaseInstance(); // 다 쓰고 나면, 자원 해제 하여 줍니다.
		
		ConnectUtil.getInstance().connectBank(); // 자원 해제가 되었으므로 새로 생성하고 호출 됩니다.
		ConnectUtil.getInstance().releaseInstance();
	}

}
