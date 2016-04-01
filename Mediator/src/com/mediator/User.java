package com.mediator;

/**
 * 抽象一个用户类，持有中介实例
 * @author Administrator
 *
 */
public abstract class User {
	
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void work();
}
