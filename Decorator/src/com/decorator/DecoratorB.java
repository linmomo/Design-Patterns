package com.decorator;

/**
 * 具体实现的装饰类2
 * @author Administrator
 *
 */
public class DecoratorB extends Decorator{

	private String tag="";
	
	public DecoratorB(Source source) {
		super(source);
		tag=this.getClass().getSimpleName();
	}
	
	@Override
	public void method1() {
		super.method1();
		decorator();
	}
	
	private void decorator(){
		System.out.println("装饰操作b=="+tag);
	}

}
