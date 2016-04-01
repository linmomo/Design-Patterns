package com.chain;

public class Test {
	public static void main(String[] args) {
		
		MyHandler handler1=new MyHandler("A");
		MyHandler handler2=new MyHandler("B");
		MyHandler handler3=new MyHandler("C");
		
		//1°üº¬2£¬2°üº¬3
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler1.operation();
	}
}
