package com.adapter;

public class Test {
	public static void main(String[] args) {
		
		//�������ģʽ
//		Adapter adapter=new Adapter();
//		adapter.method1();
//		adapter.mehthod2();
		
		//���������ģʽ
		Wapper wapper=new Wapper(new Source());
		wapper.method1();
		wapper.mehthod2();
		
	}
}
