package com.mediator;

/**
 * �����û�ʵ��2
 * @author Administrator
 *
 */
public class User2 extends User{

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("���Ź���");
	}
	
}
