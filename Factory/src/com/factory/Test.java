package com.factory;

public class Test {
	public static void main(String[] args) {
		IFactory factory = new AddFactory();
		Operation addOperation = factory.creatOperation();
		addOperation.setNum1(1.0);
		addOperation.setNum2(2.0);
		System.out.println("add=" + addOperation.getResult());
	}
}
