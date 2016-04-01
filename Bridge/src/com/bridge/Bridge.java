package com.bridge;

public class Bridge extends MyBridge{

	@Override
	public void method() {
		sourceable.method();
	}
}
