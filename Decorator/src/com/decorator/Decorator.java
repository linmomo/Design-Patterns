package com.decorator;

/**
 * 装饰者类，持有被装饰类实例
 * @author Administrator
 *
 */
public class Decorator implements Sourceable{

	private Source source;

	public Decorator(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		if(source!=null){
			source.method1();
		}
	}

}
