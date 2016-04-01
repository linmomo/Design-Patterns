package com.proxy;

/**
 * 代理类，实现基本功能接口，持有具体实现实例，来实现功能
 * @author Administrator
 *
 */
public class Proxy implements ISubject{
	
	private Subject subject;

	@Override
	public void request() {
		System.out.println("代理开始");
		if(subject==null){
			subject = new Subject();
		}
		subject.request();
		System.out.println("代理结束");
	}

}
