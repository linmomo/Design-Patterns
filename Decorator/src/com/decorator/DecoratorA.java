package com.decorator;

/**
 * ����ʵ�ֵ�װ����1
 * @author Administrator
 *
 */
public class DecoratorA extends Decorator{

	public DecoratorA(Source source) {
		super(source);
	}
	
	@Override
	public void method1() {
		super.method1();
		decorator();
	}
	
	private void decorator(){
		System.out.println("װ�β���");
	}
	
}
