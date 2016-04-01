package com.adapter;

public class Test {
	public static void main(String[] args) {
		
		//类的适配模式
//		Adapter adapter=new Adapter();
//		adapter.method1();
//		adapter.mehthod2();
		
		//对象的适配模式
		Wapper wapper=new Wapper(new Source());
		wapper.method1();
		wapper.mehthod2();
		
	}
}
