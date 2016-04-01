package com.mediator;

/**
 * 具体用户实例1
 * @author Administrator
 *
 */
public class User1 extends User{

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("一号工作");
	}

}
