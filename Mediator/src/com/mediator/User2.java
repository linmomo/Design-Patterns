package com.mediator;

/**
 * 具体用户实例2
 * @author Administrator
 *
 */
public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("二号工作");
	}
	
}
