package com.lymin.classes;

public class ConnectUtil {
	private static ConnectUtil connectUtilInstance;

	private ConnectUtil() {
		System.out.println("ConnectUtil Constructor is called.");
	}

	static ConnectUtil getInstance() {
		if (connectUtilInstance == null) {
			connectUtilInstance = new ConnectUtil();
		}
		return connectUtilInstance;
	}

	public void connectStockFirm() {
		System.out.println("connectStockFirm is OK");
	}

	public void connectBank() {
		System.out.println("connectBank is OK");
	}

	public void releaseInstance() {
		connectUtilInstance = null;
	}

}
