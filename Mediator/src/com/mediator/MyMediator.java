package com.mediator;

/**
 * 中介者具体实现
 * @author Administrator
 *
 */
public class MyMediator implements Mediator {

	private User1 user1;
	private User2 user2;

	public User1 getUser1() {
		return user1;
	}

	public User2 getUser2() {
		return user2;
	}

	@Override
	public void creteMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
