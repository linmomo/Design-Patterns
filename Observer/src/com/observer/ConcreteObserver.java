package com.observer;

/**
 * 具体的观察者，持有被观察对象的实例
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
		System.out.println("观察者:"+name+"----观察"+concreteSubject.getName());
	}
	
}
