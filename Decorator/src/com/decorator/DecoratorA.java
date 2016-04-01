package com.decorator;

/**
 * 具体实现的装饰类1
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
		System.out.println("装饰操作");
	}
	
}
