package com.mediator;

/**
 * �����û�ʵ��1
 * @author Administrator
 *
 */
public class User1 extends User{

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("һ�Ź���");
	}

}
