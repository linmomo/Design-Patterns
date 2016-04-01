package com.mediator;

/**
 * 抽象中介方法
 * @author Administrator
 *
 */
public interface Mediator {
	//包含需要中介的实例
	void creteMediator();
	
	//同意只会被中介的实例工作
	void workAll();
}
