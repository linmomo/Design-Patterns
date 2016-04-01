package com.adapteriml;

/**
 * 继承接口，实现接口方法或空实现
 * @author Administrator
 *
 */
public abstract class Warpper implements Sourceable {
	
	public void method1() {
		System.out.println("this abstract1");
	};

	public void method2() {
		System.out.println("this abstract2");
	};
}
