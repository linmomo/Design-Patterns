package com.adapter;

/**
 * ���������ģʽ
 * @author Administrator
 *
 */
public class Wapper implements Targetable {
	
	private Source source;

	public Wapper(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void mehthod2() {
		System.out.println("this object adapter");
	}
}
