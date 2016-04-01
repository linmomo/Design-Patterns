package com.observer;

/**
 * ����Ĺ۲��ߣ����б��۲�����ʵ��
 * @author Administrator
 *
 */
public class ConcreteObserver extends Observer{
	
	private String name;
	private ConcreteSubject concreteSubject;

	public ConcreteObserver(String name , ConcreteSubject subject) {
		this.name = name;
		this.concreteSubject = subject;
	}

	public ConcreteSubject getConcreteSubject() {
		return concreteSubject;
	}

	public void setConcreteSubject(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}

	@Override
	public void update() {
		System.out.println("�۲���:"+name+"----�۲�"+concreteSubject.getName());
	}
	
}
