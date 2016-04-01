package com.simplefactory;

public class Test {
	public static void main(String[] args) {
		SimpleFactory simpleFactory=new SimpleFactory();
		
		Operation addOperation = simpleFactory.createOperation('+');
		System.out.println(addOperation.operation(3.0, 5.0));
		
		Operation subOperation = simpleFactory.createOperation('-');
		System.out.println(subOperation.operation(5.0, 3.0));
	}
}
