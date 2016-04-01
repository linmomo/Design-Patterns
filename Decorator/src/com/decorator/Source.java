package com.decorator;

/**
 * 具体实现被装饰类接口
 * @author Administrator
 *
 */
public class Source implements Sourceable{
	public void method1(){
		System.out.println("我是被装饰对象");
	}
}
