package com.bridge;

public class Test {
	public static void main(String[] args) {
		MyBridge bridge=new Bridge();
		
		bridge.setSourceable(new Source1());
		bridge.method();
		
		bridge.setSourceable(new Source2());
		bridge.method();
	}
}
