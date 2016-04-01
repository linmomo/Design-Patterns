package com.proxy;

/**
 * 具体功能的实现
 * @author Administrator
 *
 */
public class Subject implements ISubject{

	@Override
	public void request() {
		System.out.println("请求数据");
	}

}
